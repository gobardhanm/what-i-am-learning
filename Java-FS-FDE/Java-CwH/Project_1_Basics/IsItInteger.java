import java.util.Scanner;

public class IsItInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check wheather it is Integer or not :");
        boolean num = sc.hasNextInt();

        if(num){
            System.out.println("It is an integer");
        }else System.out.println("It's not an integer");

    }
}
