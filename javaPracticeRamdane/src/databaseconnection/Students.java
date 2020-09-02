package databaseconnection;

public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String grades;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getGrades() {
        return grades;
    }

    public Students(int id, String firstName, String lastName, String contactNumber, String grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.grades = grades;
    }

}
