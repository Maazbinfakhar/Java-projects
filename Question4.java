import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
    double sp;
double dsp;
double p;
Scanner sc= new Scanner(System.in);
System.out.println("Enter Discounted Selling price: ");
dsp = sc.nextDouble();
if(dsp>=0){
System.out.println("Enter Discount Percentage: ");
p = sc.nextDouble();

sp=dsp/(1-(p/100));
System.out.println("Your original selling Price is: " +sp);
}
else {
    System.out.println("Invalid Input");
}
        sc.close();

}    
}
