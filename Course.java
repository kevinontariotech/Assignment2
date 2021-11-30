import java.util.Vector;

public class Course {
    private Department dept; // the department the course belongs to
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    //constructors
    public Course() {
    }

    public Course(String code, int number, Department dept, String title) {
        this.dept = dept;
        this.code = code;
        this.number = number;
        this.title = title;
        this.classList = new Vector<Student>();
    }

    //getters
    public String getDept() {
        return this.dept.toString();
    }

    public String getCode() {
        return this.code;
    }

    public int getNumber() {
        return this.number;
    }

    public Vector<Student> getStudents() {
        return this.classList;
    }
    
    //adding courses
    public void addStudentToCourse(Student s){
        this.classList.add(s);
    }

    //printing students
    public void printStudents() {
        for (Student s: classList){
            System.out.println(s.getName() + ", ");
        }
    }

    //returns the size of the course
    public int courseSize() {
        return classList.size();
    }

    public String toString() {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        return (this.code + " " + this.number + " " + this.title + ", Enrollment = " + classList.size());
    }


}
