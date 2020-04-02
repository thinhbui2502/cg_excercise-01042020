import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private int dateOfBirth;
    private String address;

    public Person () {

    }

    public Person(String name, String gender, int dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        this.name = sc.nextLine();
        System.out.println("Enter gender: ");
        this.gender = sc.nextLine();
        System.out.println("Enter the address: ");
        this.address = sc.nextLine();
        System.out.println("Enter the date of birth: ");
        this.dateOfBirth = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='"
                + name
                + ", gender='"
                + gender
                + ", dateOfBirth="
                + dateOfBirth
                + ", address='"
                + address
                + '}';
    }
}
