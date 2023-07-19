import java.util.*;
public class Fibo {
    static int n1=0,n2=1,n3=0;
    static void fib(int count){
        if(count > 0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(" "+n3);
            fib(count-1);
        }
    }
    public static void main(String[] args){
        int count;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Count For Fibonacci Series : ");
        count= s.nextInt();
        System.out.println(n1+"\n"+n2);
        fib(count-2);
    }

}
