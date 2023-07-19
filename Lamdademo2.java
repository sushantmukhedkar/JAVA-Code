import java.util.*;
@FunctionalInterface
interface Mylamda{
    public void show(String str);
}
@FunctionalInterface
interface Mylamda1{
    public int display(String str1,String str2);
}
public class Lamdademo2 {
    Lamdademo2(){}
    public static void reverse(String str){
        System.out.println("Inside Static Method ");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
    public void reverse2(String str){
        System.out.println("Non-Static Method");
       StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }    
    public Lamdademo2(String str){
        System.out.println("Inside Constructor");
        System.out.println(str.toUpperCase());
    }
    public static void main(String[] args){
        Mylamda m1 =System.out::println;
        m1.show("Hello");
        Mylamda m2 = Lamdademo2::reverse;
        m2.show("Hello");
       Lamdademo2 obj = new Lamdademo2();
        Mylamda m3 = obj::reverse2;
        m3.show("Hello");
        Mylamda m4 = Lamdademo2::new;
        m4.show("Hello");

        Mylamda1 m5 = String::compareTo;
        System.out.println(m5.display("Hello","Sushant"));
    }
}
