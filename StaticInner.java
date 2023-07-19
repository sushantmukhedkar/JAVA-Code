import java.util.*;
class Outer{
    static String name = "Sushant";
    int x =10;
    static class inner{
        String surname = "Jain";
        void display(){
            System.out.println(name+surname); // only access static members from outer class
        }
    } 
}
public class StaticInner {
    public static void main(String[] a){
        Outer.inner oi = new Outer.inner();
        oi.display();

    }
}
