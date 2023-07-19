import java.util.*;
class Add{
    static{
        System.out.println("in Static Method");
    }
    public int sum(int a,int b)
    {  return a+b; }
}
public class Static_Method {
    public static void main(String[] a)
    {
        Add obj = new Add();
        obj.sum(10,12);
    }
}
