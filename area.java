import java.util.*;
class Shape{
    public void area1(int r)
    {
        double A = 3.14*r*r;
        System.out.println("Area of Circle: " + A);
    }
    public void area1(int b,int h)
    {
        double A = 0.5*b*h;
        System.out.println("Area Of Triangle : "+ A);
    }

}
public class area {
    public static void main(String[] a)
    {
     Scanner sc = new Scanner(System.in);
     Shape obj = new Shape();
     System.out.println("Enter Radius: ");
     int r = sc.nextInt();
     System.out.println("Enter Base and Height:");
     int B = sc.nextInt();
     int H = sc.nextInt();
     obj.area1(r);
     obj.area1(B,H);
    }
}
