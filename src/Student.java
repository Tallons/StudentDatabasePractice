import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String schoolDistrictId = "954";
    private String studentId;
    private ArrayList<String> courses = new ArrayList<String>();
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor



    // prompt student name and grade
    public Student () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter students first Name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter students last Name: ");
        this.lastName = input.nextLine();

        System.out.println("Freshman, Sophomore, Junior, or Senior\nEnter students grade level: ");
        this.gradeLevel = input.nextLine();

        setStudentId();
        enroll();
        payTuition();
//        System.out.println(firstName + " " + lastName + " is a " + gradeLevel + " " + studentId);
    }


    // generate id
    private void setStudentId() {
        id++;
        this.studentId = schoolDistrictId + id;
    }

    // enroll in classes
    public void enroll() {
        do {
            System.out.println("Enter Course to Enroll (q to quit):");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.toLowerCase().equals("q")) {
                courses.add(course);
            } else {
                break;
            }
        } while (1 != 0);
        tuitionBalance = courses.toArray().length * costOfCourse;
        System.out.println("Enrolled in: " + Arrays.toString(courses.toArray()));
    }

        // view balance
    public void viewBalance () {
        System.out.println("your current balance is " + tuitionBalance);
    }

    // pay tuition
    public void payTuition () {
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // student status
    public String studentStatus () {
        return "Name: " + firstName + " " + lastName +
                "\n Grade: " + gradeLevel +
                "\nStudentID: " + studentId +
                "\nCourses Enrolled: " + Arrays.toString(courses.toArray()) +
                "\nBalance: $" + tuitionBalance;
    }

}
