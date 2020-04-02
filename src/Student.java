
import java.util.Scanner;

public class Student extends Person {
    private int studentID;
    private double score;
    private String email;

    Student() {

    }

    Student(String name, String gender, int dateOfBirth, String address, int studentID, double score, String email) {
        setName(name);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
        this.studentID = studentID;
        this.score = score;
        this.email = email;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: ");
        this.email = sc.nextLine();
        System.out.println("Enter the student ID: ");
        this.studentID = sc.nextInt();
        System.out.println("Enter the medium score: ");
        this.score = sc.nextDouble();
    }

    public boolean getScholarship() {
        return this.score > 8.0;
    }

    public void display() {
        System.out.println("Student{"
                + "name: "
                + getName()
                + ", gender: "
                + getGender()
                + ", dateOfBirth: "
                + getDateOfBirth()
                + ", address: "
                + getAddress()
                + ", ID: "
                + studentID
                + ", Score: "
                + score
                + ", email: "
                + email
                + '}');
    }
}
