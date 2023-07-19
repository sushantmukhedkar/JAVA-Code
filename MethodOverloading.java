import java.util.*;

import javax.sound.sampled.SourceDataLine;
class Adder{
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public int sum(int a,int b,int c,int d,int e)
    {
        return a+b+c+d+e;
    }
    public int sum(int a,int b,int c,int d,int e,int f)
    {
        return a+b+c+d+e+f;
    }
    public int sum(int a,int b,int c,int d,int e,int f,int g)
    {
        return a+b+c+d+e+f+g;
    }

}
public class MethodOverloading {
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
          System.out.println("Enter 1st Number: ");
          int a= s.nextInt();
          System.out.println("Enter 2nd Number: ");
          int b= s.nextInt();
          System.out.println("Enter 3rd Number: ");
          int c= s.nextInt();
          System.out.println("Enter 4th Number: ");
          int d= s.nextInt();
          System.out.println("Enter 5th Number: ");
          int e= s.nextInt();
          System.out.println("Enter 6th Number: ");
          int f= s.nextInt();
          System.out.println("Enter 7th Number: ");
          int g= s.nextInt();
          Adder obj=new Adder(); 
          System.out.println("Sum Of 1st 3 numbers: "+obj.sum(a, b, c)); 
          System.out.println("Sum Of 1st 4 numbers: "+obj.sum(a, b, c, d)); 
          System.out.println("Sum Of 1st 5 numbers: "+obj.sum(a, b, c, d, e)); 
          System.out.println("Sum Of 1st 6 numbers: "+obj.sum(a, b, c, d, e, f));
          System.out.println("Sum Of 1st 3 numbers: "+obj.sum(a, b, c, d, e, f, g));  

    }
}
