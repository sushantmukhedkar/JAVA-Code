import java.util.*;
abstract class Shape{
    abstract public double Area();
    abstract public double Perimeter();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius= radius;
    }
    double Area(){
        return Math.PI*radius*radius;
    }
    double Perimeter(){
        return Math.PI*2*radius;
    }
}
class Rect extends Shape{
    private double l;
    private double b;
    Rect(double l,double b)
    {
 
        this.l=l;
        this.b=b;
    }
    double Area(){
        return l*b;
    }
    double Perimeter(){
        return 2*(l+b);
    }
}

public class AbstractExample {
    public static void main(String[] args){
        Shape s;
        s = new Circle(70);
        System.out.println("Area Of Circle "+s.Area());
        System.out.println("Perimeter Of Circle "+s.Perimeter());
        s = new Rect(10,5);
        System.out.println("Area Of Rectangle :"+s.Area());
        System.out.println("Perimeter Of Rectangle :"+s.Perimeter());
    }
    
}
