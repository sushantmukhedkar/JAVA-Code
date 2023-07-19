import java.util.*;
class student{
    private String name;
    private int roll;
    private String branch;
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname(){return name;}
    public void setroll(int roll){
        this.roll=roll;
    }
    public int getroll(){return roll;}
    public void setbranch(String branch)
    {
        this.branch = branch;
    }
    public String getbranch(){return branch;}
}
class info extends student{
    public void show(){
        System.out.println("Name: " + getname());
        System.out.println("Roll No: "+getroll());
        System.out.println("Branch: "+getbranch());
    }
}
public class SingleIn {
    public static void main(String[] args)
    {
       info obj = new info();
       obj.setname("Sushant Jain");
       obj.setroll(60); 
       obj.setbranch("Information Technology");
       obj.show();
    }
}
