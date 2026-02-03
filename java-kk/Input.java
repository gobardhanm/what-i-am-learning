import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you roll no: ");
        int rollNo = input.nextInt();
        System.out.println("Your seat no is: " + rollNo * 3 );

        // we can use underscore as comma to write big number ( comma not acceptable)

        int salary = 232_032_332;
        System.out.println("Your salary is: " + salary);

        // we can take an entire line as input with .nextLine() 
        String s;
        Scanner sInput = new Scanner(System.in);
        s = sInput.nextLine();
        System.out.println(s);
    }
}

// 1:02:38
