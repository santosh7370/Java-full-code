class Pen{
  String color;
  String type;
    public void write() {
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this Color);
    }
}
public class OOPS{
    public  static void main(String args[]){
     Pen p=new Pen();
     p.color="blue";
     p.type="red";
     Pen p1=new Pen();
     p1.color="black";
     p1.type="ballpoint";
     p.printColor();
     p1.printColor();   
    }
}