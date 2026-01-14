import java.util.Scanner;

public class Question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int a;
            
                System.out.println("TYPE ANY INTEGER: ");
                a=sc.nextInt();
                if (a % 2 == 0)
                {
                    System.out.println("EVEN");
                }
                else
                {
                    System.out.println("ODD");
                }
                  sc.close();

    }

}