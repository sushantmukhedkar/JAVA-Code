import java.util.*;
abstract class Name{
    abstract void display();
}
interface Name1{
   public void display1();
}
class Outer{
    public void PrintAbstarct(){
        class Inner{
            Name obj = new Name() {
                public void display(){
                    System.out.println("Sushant Jain");
                }
            };
            obj.display();
        }
    }
    public void PrintInterface(){
        class Inner1{
            Name1 obj1 = new Name1() {
                public void display1(){
                    System.out.println("Sushant Mukhedkar");
                }
            };
            obj1.display1();
        }
    }
  
}
public class AnonymousInnerclass {
    public static void main(String[] args){
        System.out.println("Abstract Class Overridding");
        Outer o = new Outer();
        o.PrintAbstarct();;
        System.out.println("Implements Inetrface Method");
        o.PrintInterface();
    }
    
}
