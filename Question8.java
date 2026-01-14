import java.util.Scanner;
public class Question8
{
    public static void main(String[] args)
    {
        
        double a;
        double s;
        double l;
        double c;
        double d;
        Scanner sc = new Scanner(System.in);

            
                System.out.println("ENTRE FIRST LENGTH OF TRIANGLE");
                l=sc.nextDouble();
                
                    System.out.println("ENTRE SECOND LENGTH OF TRIANGLE");
                    c=sc.nextDouble();
                    
                
                        System.out.println("ENTRE THIRTH LENGTH OF TRIANGLE");
                        d=sc.nextDouble();
                        if(c>0&&l>0&&d>0)
                        {
                            s=(l+c+d)/2;
                            a =Math.sqrt(s*(s-l)*(s-c)*(s-d));
                            System.out.println("SEMI PERIMETER OF TRIANGLE IS: "+s);
                            System.out.println("AREA OF TRINAGLE IS: "+a);
                        }
                        else
                        {
                            System.out.println("Try again| Innvalid INPUT");
            
                        }
                                          sc.close();

    }
}