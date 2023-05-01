public class Student {
    private static int idBase = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Student(String lastName, String firstName) {
        ++idBase;
        this.id = idBase;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
    }

    public void setFirstName(String newFirstName) {
    }

    public void setId(int id) {
    }
}
