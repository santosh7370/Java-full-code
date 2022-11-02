class Car
{
 void show()
 {
Sring modal;
int manifactureYear;
System.out.println("Year");
System.out.println("Modal");
}
}
public class Main
{
    public static  void main(String args[])
    {
        Car c=new Car();
        c.modal="Toyata Corolla";
        c.manifactureYear=2022;
        System.out.println("Year"+c.manifacture);
        System.out.println("Modal"+c.modal);
    }
}