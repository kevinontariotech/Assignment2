public class Person {
    private String name; //name of person

    //constructors
    public Person(String initialName) {
        this.name = initialName;
    }

    public Person() {
    }

    //setter
    public void setName(String fullName) {
        this.name = fullName;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
