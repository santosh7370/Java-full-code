import java.util.Scanner;
class for_break
{
    public static void main(String[] args)
    {
        int num;
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    for(int i=1;i<=10;i++)
    {
    int check = num*i;
    if(check==60)
     break;
     else
      System.out.println(num*i);
    }
    }
}