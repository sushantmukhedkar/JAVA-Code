import java.util.Scanner;
import java.util.*;
public class Main {
    public void dup(int n) {
        for(int i=0; i<n; i++) {
            System.out.println("ASCII value of"+(char)i+"="+i);
            }
        }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        Main obj = new Main();
        System.out.print("Enter the number : ");
        int N =sc.nextInt();
        obj.dup(N);
    }
}
