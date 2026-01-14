import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your obtained marks:");
        a = sc.nextDouble();

        System.out.println("Enter your total marks:");
        b = sc.nextDouble();
        if (a <= b && b != 0) {
            c = (a / b) * 100;
            System.out.println("Percentage: " + c);
        } else {
            System.out.println("Invalid input | Try again");
        }

        sc.close();
    }
}
