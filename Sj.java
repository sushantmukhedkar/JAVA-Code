import java.util.*;
import tools.*;

public class Sj {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        Calc obj = new Calc();
        System.out.println("Addition: "+obj.sum(a,b));
        System.out.println("Substraction: "+obj.sub(a,b));
        System.out.println("Multiplication: "+obj.mul(a,b));
        System.out.println("Division: "+obj.div(a,b));
        
    }
    
}
