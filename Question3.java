import java.util.Scanner;
public class Question3 {
public static void main(String[] args) {
double sp;
double dsp;
double dp;
double p;
Scanner sc= new Scanner(System.in);
System.out.println("Enter Original Selling price: ");
sp = sc.nextDouble();
if(sp>0){
System.out.println("Enter Discounted Percentage: ");
p = sc.nextDouble();
if(p<=100&&p>0){
dp=(sp*p)/100;
dsp=sp-dp;
System.out.println("Your discount is : " + dp);
System.out.println("Your Discounted Price is : " + dsp);
}}
else{
    System.out.println("Invalid selling price | Try again");
}
sc.close();
}

}
