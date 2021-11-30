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
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void offerCourse(Course course) {
        courseList.add(course);
    }

    public void registerStudentCourseInDepartment(Student s, Course c) {
        if(!this.courseList.contains(c)) {
            this.courseList.add(c);
        }
        if(!this.registerList.contains(s)){
            this.registerList.add(s);
        }
    }

    public void printCoursesOffered() {
        for (Course c: this.courseList) {
            System.out.println(c.getCode() + " " + c.getNumber());
        }
    }

    public void printStudentsByName() {
        for (Student s: this.registerList) {
            System.out.println(s.getName());
        }
    }

    public boolean isStudentRegistered(Student s) {
        if (this.registerList.contains(s)) {
            return true;
        }
        return false;
    }

    public Vector<Student> studentsRegisteredInCourse (int code) {
        Vector<Student> s = new Vector<Student>();
        Course course = new Course();
        for(Course c: courseList){
            if(c.getNumber() == code){
                course = c;
            }
        }
        return course.getStudents();
    }

    public void printStudentsRegisteredInCourse(int code) {
        System.out.println(studentsRegisteredInCourse(code));
    }

    public String largestCourse() {
        Course largest = courseList.get(1);
        for (Course c: courseList) {
            if (largest.courseSize() < c.courseSize()) {
                largest = c;
            }
        }
        return largest.toString();
    }

    public String toString() {
        return (id + ": " + courseList.size() + " courses, " + registerList.size() + " students");
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
    }
}
