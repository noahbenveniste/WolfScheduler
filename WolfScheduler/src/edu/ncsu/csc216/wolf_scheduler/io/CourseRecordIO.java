package edu.ncsu.csc216.wolf_scheduler.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ncsu.csc216.wolf_scheduler.course.Course;

/**
 * Reads Course records from text files.  Writes a set of CourseRecords to a file.
 * 
 * @author Noah Benveniste
 */
public class CourseRecordIO {

    /**
     * Reads course records from a file and generates a list of valid Courses.  Any invalid
     * Courses are ignored.  If the file to read cannot be found or the permissions are incorrect
     * a File NotFoundException is thrown.
     * @param fileName file to read Course records from
     * @return a list of valid Courses
     * @throws FileNotFoundException if the file cannot be found or read
     */
	public static ArrayList<Course> readCourseRecords(String fileName) throws FileNotFoundException {
	    Scanner fileReader = new Scanner(new FileInputStream(fileName));
	    
	    //Generate the arraylist to contain the course objects
	    ArrayList<Course> courses = new ArrayList<Course>();
	    
	    //Continue reading through the file while there are lines to read
	    while (fileReader.hasNextLine()) {
	        //Try to read the course
	    	try {
	    		//Call the helper class to parse the line and get the course information
	            Course course = readCourse(fileReader.nextLine());
	            //If the course can be read, check for duplicates in the arraylist
	            boolean duplicate = false;
	            for (int i = 0; i < courses.size(); i++) {
	                Course c = courses.get(i);
	                if (course.getName().equals(c.getName()) &&
	                        course.getSection().equals(c.getSection())) {
	                    //it's a duplicate
	                    duplicate = true;
	                }
	            }
	            //If the current course object isn't a duplicate, add it to the arraylist
	            if (!duplicate) {
	                courses.add(course);
	            }
	        //If the course is invalid, skip the line
	        } catch (IllegalArgumentException e) {
	            //skip the line
	        }
	    }
	    fileReader.close();
	    return courses;
	}
    
    /**
     * Helper method that parses individual courses that are read in as lines from the input file
     * @param nextLine
     * @return
     */
    private static Course readCourse(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Writes the given list of Courses to an output file
     * @param fileName
     * @param courses
     * @throws IOException
     */
    public static void writeCourseRecords(String fileName, ArrayList<Course> courses) throws IOException {
    	//Initalize printstream object to write to file
    	PrintStream fileWriter = new PrintStream(new File(fileName));

    	//Index throught the arraylist, printing one course per line
    	for (int i = 0; i < courses.size(); i++) {
    	    fileWriter.println(courses.get(i).toString());
    	}

    	//Once all courses have been printed into the file, close the printstream
    	fileWriter.close();
    }

}