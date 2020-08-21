import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args){

        // prompt for number of new students
        System.out.println("Please enter number of new students");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            System.out.println(students[i].studentStatus());

        }
    }
}
