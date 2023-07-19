import java.util.*;
class stud{
    private String name;
    private int roll;
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname(){return name;}
    public void setroll(int roll)
    {
        this.roll=roll;
    }
    public int getroll(){return roll;}
    public void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}
public class Methods {
    public static void main(String[] a){
       stud obj = new stud();
       obj.setname("Sushant");
       obj.setroll(60);
       obj.show();
    }
}
