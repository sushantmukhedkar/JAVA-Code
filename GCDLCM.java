import java.util.*;

public class GCDLCM {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static int lcm(int a, int b, int c) {
        int j = Math.abs(a * b) / c;
        return j;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two Number for GCD and LCM : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int g = gcd(a, b);
        int l = lcm(a, b, g);
        System.out.println("GCD: "+ g + " "+ "LCM: " + l);
    }
}
