import java.util.*;
public class ASCII{
    public void S(String name)
    {
        int n = name.length();
        char[] a =name.toCharArray();
        for(int i =0; i < n ;i++)
        {
            int ascii = a[i];
            System.out.println("The ASCII value of " + a[i] + " is: " + ascii);
        }
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String sj = sc.nextLine();
        ASCII obj = new ASCII();
        obj.S(sj);
        
    }
}