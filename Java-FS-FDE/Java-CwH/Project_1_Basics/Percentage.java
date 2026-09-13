import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the sub1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of the sub2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of the sub3: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks of the sub4: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks of the sub5: ");
        int sub5 = sc.nextInt();

        System.out.println("Enter the total marks of the student: ");
        int totalMarks = sc.nextInt();

        double percentage = ((double)(sub1 + sub2 + sub3 + sub4 + sub5) / totalMarks) * 100;

        System.out.println("The total percentage of the given student is:" + percentage);
    }
}
