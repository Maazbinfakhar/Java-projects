import java.util.Scanner;
public class Question6{

    public static void main(String[] args)
    {
       
        double a;
        double b;
        double c;
        double ht;
        Scanner sc= new Scanner(System.in);
            
                System.out.println("ENTRE HEIGHT OF TRAPEZOID");
                ht=sc.nextDouble();
                
                    System.out.println("ENTRE LENGTH OF FIRST BASE: ");
                    b=sc.nextDouble();
                
                        System.out.println("ENTRE LENGTH OF SECOND BASE: ");
                        c=sc.nextDouble();
                        if(ht>0 && b>0 &&c>0)
                        {
                            a=ht*((b+c)/2);
                            System.out.println("AREA OF TRAPEZOID IS: "+a);

                        }
                        else
                        {
                            System.out.println("Invalid Input| Try again");
                        
                        }
                  
        
                  sc.close();
      
            
        
    }

}