import java.util.*;
class Base{
    int phy;
    int chem;
    public int result(int a, int b)
    {
        phy = a;
        chem = b;
        int c = phy+chem;
        return c;
    }
}
public class Derived{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Base obj = new Base();
        System.out.println("Enter Marks: ");
        int p = s.nextInt();
        int ch = s.nextInt();
        int r = obj.result(p,ch);
        System.out.println("RESULT: "+r);

    }
}
