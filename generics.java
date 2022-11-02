class generics
{
public <T> void printArray(T []s)
{
for(T x:s)
{
    System.out.println(x);
}
}
public static void main(String[] args)
{
    generics g1=new generics();
    String Name[]={"Santosh","Rahul","Sachin","Brujesh"};
    Integer Number[]={123,234,432,123,434,532,535,34,456};
    g1.printArray(Name);
    g1.printArray(Number);
    }
}
