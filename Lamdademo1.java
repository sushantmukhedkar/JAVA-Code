import java.util.*;
@FunctionalInterface
interface Mylamda{
    public void display();
}
@FunctionalInterface
interface Mylamda1{
    public void display(String s);
}
@FunctionalInterface
interface Mylamda2{
    public int add(int a,int b);
}
public class Lamdademo1 {
    public static void main(String[] args)
    {
        Mylamda m1 = ()->{System.out.println("Hello");};
        m1.display();
        Mylamda1 m2 = (s)->{System.out.println(s);};
        m2.display("World!!");
        Mylamda2 m3 =(a,b)->{return a+b;};
        System.out.println(m3.add(10, 20)); 
        Mylamda2 m4 =(a,b)->a+b;
        System.out.println(m4.add(50, 50));
    }
    
}
