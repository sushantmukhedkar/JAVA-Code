import java.util.Scanner;
import java.util.*;
public class Duplicate
{
    public void dup(String name)
    {
        int n = name.length();
        int count=0;
        char[] s =name.toCharArray();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i]==s[j])
                 System.out.println(s[i]+" is dublicate"); 
                else
                 count++;
            }
        }
        if((count/2)== n)
        {
             System.out.println("nothing is dublicate"); 
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Duplicate obj =new Duplicate();
        System.out.print("Enter the String : ");
        String Name=sc.nextLine();
        obj.dup(Name);
    }
}