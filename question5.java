import java.util.Scanner;
public class question5
{
    public static void main(String[] args)
    {

        double a;
        double v;
        double w;
        Scanner sc= new Scanner(System.in) ;
        
                System.out.println("ENTRE AMPERE: ");
                a=sc.nextDouble();
            
                
                    System.out.println("ENTRE VOLTAGE: ");
                    v=sc.nextDouble();
                    
                if(a>0 && v>0){
                        w=a*v;
                        System.out.println("POWER IS :"+w);
                    
            
                }
                else
                {
                    System.out.println("Invalid input | Tery again");
                  
                }
                sc.close();
    
        
    }
}