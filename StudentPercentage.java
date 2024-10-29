import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;

        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i=1; i<=5; i++) {
            System.out.println("Subject " + i + ": ");
            totalMarks += scanner.nextInt();
        }
        double percentage = totalMarks / 5.0;
        System.out.printf("Percentage: %.2f%%", percentage);

        scanner.close();
    }
}
