import java.util.Scanner;
class Switch{
    public static void main(String[] args){
        int a,b,c,ch;
        System.out.println("Enter the two number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("choose your choice     1=Addition  2=Subtraction  3=Multipication  4=Division  5=Remender");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
            {
                c=a+b;
            System.out.println("Addition:="+c);
            break;
            }
            case 2:
            {
                c=a-b;
            System.out.println("Subtraction:="+c);
            break;
            }
            case 3:
            {
                c=a*b;
            System.out.println("Multipication:="+c);
            break;
            }
            case 4:
            {
                c=a/b;
            System.out.println("Division:="+c);
            break;
            }
            case 5:
            {
                c=a%b;
            System.out.println("Remender:="+c);
            break;
            }
            default:
            {
            System.out.println("Invalid choice ..............");
            }
        }
    }
}