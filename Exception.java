import java.util.Scanner;
import java.util.*;
public class Exception {
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Two Number: ");
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Catched...");
        }

    }
    
}
