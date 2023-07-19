import java.util.*;

public class Java_02_Constructor {

    public Java_02_Constructor() {
        System.out.println("Default Constructor Called");
    }

    public Java_02_Constructor(int a, int b) {
        System.out.println("Parameterized Constructor Called");
        System.out.println("A: " + a + " " + "B: " + b);
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int A = s.nextInt();
        int B = s.nextInt();
        Java_02_Constructor sj = new Java_02_Constructor();
        Java_02_Constructor sj01 = new Java_02_Constructor(A, B);
    }

}
