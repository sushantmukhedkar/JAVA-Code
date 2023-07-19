import java.util.Scanner;
public class Palindrome_String {
    public void pal(String a) {
        StringBuffer b=new StringBuffer();
        b.reverse();
        java.lang.String c=b.toString();
        if(a.equals(c))
            System.out.println("String is palandrome");
        else
            System.out.println("String is not palandrome");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Palindrome_String obj = new Palindrome_String();
        System.out.print("Enter the String : ");
        String base = sc.next();
        obj.pal(base);
    }
}