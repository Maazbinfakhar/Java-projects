
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args)
    {
double c;
double r;
double a;
Scanner sc = new Scanner(System.in);
 System.out.println("Enter the value of Radius");
 r= sc.nextDouble();
 
 if(r>0)
 {c=2*r*(3.14);
System.out.println("Your circumfarance is " +c );


 a=r*r*(3.14);
System.out.println("Your Area is " +a );
 }
 else
    System.out.println("Invalid Input");
sc.close();
    }
}