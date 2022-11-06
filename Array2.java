import java.util.Scanner;
class Array2
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array element");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array Elements:");
        for(int b:a)
        {
            System.out.print(b+" ");
        }
    }
    
}