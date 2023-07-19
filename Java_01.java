import java.util.*;
public class Java_01 {
    public static void main(String[] a)
    {
         Scanner s = new Scanner(System.in); 
            System.out.println("Enter Two Numbers:");
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println("Enter valid Operator for Operation : ");
            char op = s.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println("Addition: "+(x+y));
                    break;
                case '-':
                    System.out.println("Substraction:"+(x-y));
                    break;
                case '*':
                    System.out.println("Multiplication:"+(x*y));
                    break;
                case '/':
                    System.out.println("Division: "+ (x/y));
                    break;
                default:
                    System.out.println("Enter Valid Operator!");
                    break;
            }



    }
    
}
