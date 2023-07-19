import java.util.*;
class Triangle{
    private int base;
    private int height;
    public void setbh(int base,int height)
    {
        this.base= base;
        this.height=height;
    }
    /*  public void getbh()
    {
        return base;
    }
    public void geth()
    {
        return height;
    }*/

    public void area(){
        System.out.println("Area Of triangle: "+0.5*base*height);
    }
}
class Square extends Triangle{
    private int side;
    public void sets(int side)
    {
        this.side=side;
    }
    // public void getside()
    // {
        // return side;
   // }
    public void area(){
        System.out.println("Area Of Squrare: "+side*side);
    }
}
public class Exam {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base and height : ");
        int base = s.nextInt();
        int height  = s.nextInt();
        System.out.println("Enter Side of Square : ");
        int side = s.nextInt();
        Triangle obj = new Triangle();
        obj.setbh(base,height);
        obj.area();
        Square obj1 = new Square();
        obj1.sets(side);
        obj1.area();
    }
    
}
