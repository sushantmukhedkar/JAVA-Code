import java.util.Scanner;
abstract class shape{
    abstract int area(int a,int b);
    abstract double area(double r);
}
class Rect extends shape{
    int area(int a,int b){
        return a*b;
    }
    double area(double r){return 0;}
}
class Cir extends shape {
    double area(double r){
        double h = 3.14*r*r;
        return  h;
    }
    int area(int a,int b){return 0;}

}
class Tri extends shape {
    int area(int a,int b){
        double l=0.5*a*b;
        return (int) l;
    }
    double area(double r){return 0;}
   
}

public class Prac04 {
    public static void main(String[] a){ 
    Scanner s = new Scanner(System.in);
    shape obj;
    obj = new Tri();
    System.out.println("Enter Base and Height: ");
    int base = s.nextInt();
    int height = s.nextInt();
    System.out.println("Area Of Triangle :"+obj.area(base,height));
    obj = new Rect();
    System.out.println("Enter Length and Breadth : ");
    int length = s.nextInt();
    int breadth = s.nextInt();
    System.out.println("Area Of Rectangle :"+obj.area(length,breadth));
    obj = new Cir();
    System.out.println("Enter Radius : ");
    int radius = s.nextInt();
    System.out.println("Area Of Circle :"+obj.area(radius));
   }
}
