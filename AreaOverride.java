import java.util.*;

class Circle{
    public double radius;
   // public void setradius(double r){this.radius = r;}
    Circle(double radius)
   {
    this.radius= radius;
   } 
   public double Area()
    {
        return Math.PI*radius*radius;
    }
}
class Rect extends Circle{
    private double l;
    private double b;
    Rect(double l,double b,double radius)
    {
        super(radius);
        this.l=l;
        this.b=b;
    }
    public double Area(){
        System.out.println("Area of Circle : "+super.Area()+"\n");
        return l*b;
    }
}
class AreaOverride {
    public static void main(String[] args){
        Circle c ; 
        //c.setradius(7);
        c = new Rect(10, 5, 7);
       System.out.println("Area OF Rectangle : "+ c.Area()); 
    }
    
}
