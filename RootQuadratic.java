import java.util.*;
public class RootQuadratic {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a,b,c :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double r1,r2;
        r1 = ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
        r2 = ((-b - Math.sqrt(b*b- 4*a*c))/(2*a));
        System.out.println("Roots are : "+r1+" "+r2);
    
    
    }

    
}
