/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.course;

/**
 * @author Noah Benveniste
 *
 */
public class Course {
    
	/** Fields */
	
	/** Course's name. */
	private String name;
	/** Course's title. */
	private String title;
	/** Course's section. */
	private String section;
	/** Course's credit hours */
	private int credits;
	/** Course's instructor */
	private String instructorId;
	/** Course's meeting days */
	private String meetingDays;
	/** Course's starting time */
	private int startTime;
	/** Course's ending time */
	private int endTime;
	
	/** Constructors */
	
	/**
	 * Constructor for Course object with values for all fields.
	 * @param name Name of the Course
	 * @param title Title of the Course
	 * @param section Section number of the Course
	 * @param credits Number of credit hours for the Course
	 * @param instructorId Course instructor's unity id
	 * @param meetingDays First letter of all days the Course meets
	 * @param startTime Start time of the Course
	 * @param endTime End time of the Course
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays,
			int startTime, int endTime) {
		setName(name);
	    setTitle(title);
	    setSection(section);
	    setCredits(credits);
	    setInstructorId(instructorId);
	    setMeetingDays(meetingDays);
	    setStartTime(startTime);
	    setEndTime(endTime);
	}
	
	/**
	 * Constructor for Course that has an arranged meeting time.
	 * @param name Name of the Course
	 * @param title Title of the Course
	 * @param section Section number of the Course
	 * @param credits Number of credit hours for the Course
	 * @param instructorId Course instructor's unity id
	 * @param meetingDays First letter of all days the Course meets
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays) {
		this(name, title, section, credits, instructorId, meetingDays, 0, 0);
	}
    
	/** Getters and Setters */
	
	/**
	 * Gets the course's name.
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the Course's name.  If the name is null, has a length less than 4 or 
     * greater than 6, an IllegalArgumentException is thrown.
     * @param name the name to set
     * @throws IllegalArgumentException if name is null or length is less than 4 or 
     * greater than 6
	 */
	private void setName(String name) {
		//First, check that the input isn't null
		if (name == null) {
	        throw new IllegalArgumentException();
	    }
		//Next, check that the input is of the correct length
	    if (name.length() < 4 || name.length() > 6) {
	        throw new IllegalArgumentException();
	    }
		this.name = name;
	}
	/**
	 * Gets the course's title.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Sets the course's title.
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Gets the course's section.
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * Sets the course's section.
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * Gets the course's number of credits.
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * Sets the course's number of credits.
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * Gets the instructor's unity id.
	 * @return the instructorId
	 */
	public String getInstructorId() {
		return instructorId;
	}
	/**
	 * Sets the instructor's unity id.
	 * @param instructorId the instructorId to set
	 */
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	/**
	 * Gets the meeting days.
	 * @return the meetingDays
	 */
	public String getMeetingDays() {
		return meetingDays;
	}
	/**
	 * Sets the meeting days.
	 * @param meetingDays the meetingDays to set
	 */
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	/**
	 * Gets the start time.
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}
	/**
	 * Sets the start time.
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	/**
	 * Gets the end time.
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * Sets the end time.
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
    
	/** Overridden hashCode() and equals() */
	
	/**
	 * Generates a hashCode for Course using all fields.
	 * @return hashCode for Course
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credits;
		result = prime * result + endTime;
		result = prime * result + ((instructorId == null) ? 0 : instructorId.hashCode());
		result = prime * result + ((meetingDays == null) ? 0 : meetingDays.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + startTime;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/**
	 * Compares a given object to this object for equality over all fields.
	 * @param obj The object to compare
	 * @return true if the objects are the same over all fields
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (credits != other.credits)
			return false;
		if (endTime != other.endTime)
			return false;
		if (instructorId == null) {
			if (other.instructorId != null)
				return false;
		} else if (!instructorId.equals(other.instructorId))
			return false;
		if (meetingDays == null) {
			if (other.meetingDays != null)
				return false;
		} else if (!meetingDays.equals(other.meetingDays))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (startTime != other.startTime)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	/** Overridden toString() */
	
	/**
	 * Returns a comma separated value String of all Course fields.
	 * @return String representation of Course
	 */
	@Override
	public String toString() {
	    if (meetingDays.equals("A")) {
	        return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays;
	    }
	    return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays + "," + startTime + "," + endTime; 
	}
	
}
