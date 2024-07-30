import java.util.Scanner;

public class supplementary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] students = new String[numStudents];
        int[] grades = new int[numStudents];

        // Collect student names and grades from user input
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            students[i] = scanner.next();

            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            grades[i] = scanner.nextInt();
        }

        // Display each student's grade along with a message indicating if they have passed or failed
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student: " + students[i] + " - Grade: " + grades[i]);

            if (grades[i] >= 50) {
                System.out.println(" - Passed");
            } else {
                System.out.println(" - Failed");
            }
        }
    }
}
