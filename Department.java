import java.util.HashSet;
import java.util.Vector;

public class Department {
   	private String name; // the name of school Dept of Computing and Info Science
   	private String id; // short name for courses SOFE, ELEE, STAT, etc
   	private Vector<Course> courseList; // all courses offered by the department
   	private Vector<Student> registerList; // all students taking courses in the department.

   
   	public Department(String name, String id) {
		this.name = name;
		this.id = id;
		this.courseList = new Vector<Course>;
		this.registerList = new Vector<Student>;
	}

   	public String getName() {
	   	return this.name;
   	}

   	public String getId() {
		return this.id;
   	}
   
 	
   	public String toString() {
      		return (id + ": " + courseList.length() + " courses, " + registerList.length() + " students");
		// returns a string representation of department name, number 
      		// of courses offered and number of students registered in the
      		// department. Use the format:
      		// ECSE: 53 courses, 460 students     
   	}
}
