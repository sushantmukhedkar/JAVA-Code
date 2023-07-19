// import java.util.*;
import java.util.Scanner;
class Base
{
    int phy;
    int chem;
    
}
class Derived extends Base {
     int result(int a, int b)
    {
       phy = a;
       chem = b;
        return (phy+chem);
    }

    
}

public class ISE {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Derived obj = new Derived();
        System.out.println("Enter Marks: ");
        int p = a.nextInt();
        int ch = a.nextInt();
        int r = obj.result(p,ch);
        System.out.println("RESULT: "+r);

    }
    
}
