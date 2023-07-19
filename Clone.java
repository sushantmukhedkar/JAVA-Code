import java.util.*;
class info{
    info(String name,int age)
    {
        System.out.println("Name : "+name);
        System.out.println("Age: "+age);
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();

    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Enter Age: ");
        int age = s.nextInt();
        info obj1 = new info(name, age);
        info obj2 = (info)obj1.clone(); 

    }
    
}
