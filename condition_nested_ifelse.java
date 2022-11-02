import java.util.Scanner;
class condition_nested_ifelse
{
    public static void main(String[] args)
    {
        int ,num1,num2,num3;
        System.out.println(" Enter the three number");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("maximim number:= "+num1);
            }
            else
            {
                System.out.println("maximim number:= "+num3);
            }
        }
        else
        {
            System.out.println("maximim number:= "+num2);
        }
    }
}