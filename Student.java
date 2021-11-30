import java.util.Vector;

public class Student extends Person {
    private String id;
    private String name;
    private Vector<Course> courses; // contains all courses the student is registered in


    public Student(String stdId, String stdName) {
        this.id = stdId;
        this.name = stdName;
        this.courses = new Vector<Course>();
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void registerFor(Course c){
        this.courses.add(c);
    }

    public boolean isRegisteredInCourse(Course c) {
        if (this.courses.contains(c)) {
            return true;
        }
        return false;
    }

    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        String r = this.id + " " + this.name + "\nRegistered courses: ";

        for(Course c :courses){
            r += c.toString();
        }

        return r;
    }
}
