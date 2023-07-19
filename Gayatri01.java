import java.util.*;

class calculator {
    public static void main(String[] args) {
        Scanner C = new Scanner(System. in);
        int result;
        System.out.println("Enter sny two numbers!");
        int a=C.nextInt();
        int b=C.nextInt();
        System.out.println("Enter option to solve operations");
        int op=C.nextInt();
        switch(op)
        {
            case 1:
            result=a+b;
            System.out.println("addition is "+result);
            break;
            case 2:
            result=a-b;
            System.out.println("sutraction"+result);
            
            break;
            case 3:
            result=a*b;
            System.out.println("multiplication"+result);
            
            break;
           case 4:
            result=a-b;
            System.out.println("divison is "+result);
           break;
           
           default:
            System.out.println ("better luck next time");
        }
    }
}