import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addData() {
        Student student2 = new Student();
        student2.inputData();
        student2.inputStudentInfo();
        studentList.add(student2);
    }

    public void displayInfo() {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }

    public void removeID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to remove: ");
        int idForRemove = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == idForRemove) {
                studentList.remove(studentList.get(i));
            }
        }
    }

    public void replaceID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to replace: ");
        int idForReplace = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == idForReplace) {
                studentList.remove(studentList.get(i));
                Student newStudent = new Student();
                newStudent.inputData();
                newStudent.inputStudentInfo();
                studentList.add(i, newStudent);
            }
        }
    }

    public void findByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to find: ");
        int idToFind = sc.nextInt();
        for (Student student : studentList) {
            if (student.getStudentID() == idToFind) {
                System.out.println("This is the ID you want to find: ");
                student.display();
            }
        }
    }

    public void findByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to find: ");
        String nameToFind = sc.nextLine();
        for (Student student : studentList) {
            if (student.getName().equals(nameToFind)) {
                System.out.println("This is the name you want to find: ");
                student.display();
            }
        }
    }

    public void showScholarship() {
        for (Student student : studentList) {
            if (student.getScore()>8.0) {
                System.out.println("These are scholarship students: ");
                student.display();
            }
        }
    }

    public void showFemaleStudent() {
        for (Student student : studentList) {
            if (student.getGender().equals("female")) {
                System.out.println("These are female students ");
                student.display();
            }
        }
    }
}


