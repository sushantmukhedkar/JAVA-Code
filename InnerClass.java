import java.util.*;
class Outer{
    String name = "Sushant";
    class Inner{
        String surname ="Jain";
        public void innerdisplay(){
            System.out.println(name+" "+surname); // inner class can access outer class members
        }
    } 
    public void outerdisplay(){
        Inner i = new Inner();                   // for Outer class creation of inner class object is needed for access members
        i.innerdisplay(); 
    }
}
public class InnerClass {
    public static void main(String[] args){
        Outer o = new Outer();
        o.outerdisplay();
        System.out.println("Creation Of Inner class Object: ");
        Outer.Inner oi = new Outer().new Inner();
        oi.innerdisplay();
    }
    
    
}
