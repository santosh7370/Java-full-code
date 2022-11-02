import java.util.Scanner;
class fortable
{
    public static void  main(String[] args)
    {
        int n;
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=10;i++) 
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("  "+j*i   );
            }
            System.out.println(" ");
        }
    }
}