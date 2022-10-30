class student
{
int roll,mark;
String name;
void input()
{
System.out.println("Enter roll name mark:");
}
}
class Rohit extends student
{
void display()
{
roll=1;
mark=99;
name="Rohit";
System.out.println(roll+" "+name+" "+mark);
}
}
class main
{
public static void main(String args[])
{
Rohit r=new Rohit();
r.input();
r.display();
}
}
