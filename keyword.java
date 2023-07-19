import java.util.*;
class Rect {
    int x =20;
    private int length;
    private int breadth;
    Rect(){
        length=breadth=1;
    } 
    Rect(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class cuboid extends Rect{
    private int height;
    cuboid(){ height=1;}
    cuboid(int l,int b,int height){
        super(l, b);
        this.height= height;
    }
    public int volume(){
        System.out.println("Integer in Rect class : "+super.x);
        return area()*height;
    }
}
public class keyword {
    public static void main(String[] args){
        Rect s = new Rect(10, 5);
        System.out.println("Area: "+s.area());
        cuboid c = new cuboid();
        System.out.println("Volume: "+c.volume());
        cuboid c1 = new cuboid(5, 6, 7);
        System.out.println("Volume : "+c1.volume());

    }
    
}
