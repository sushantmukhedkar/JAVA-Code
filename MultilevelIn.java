import java.util.*;
class student{
    private String name;
    private int roll;
    private String branch;
    public void setname(String name)
    {
        this.name = name;
    }
    public void setroll(int roll){
        this.roll=roll;
    }
    public String getname(){return name;}
    public int getroll(){return roll;}
    public void setbranch(String branch)
    {
        this.branch = branch;
    }
    public String getbranch(){return branch;}
}
class Result extends student{
    private int p;
    private int c;
    private int m;
    int total;
    public void setmarks(int p,int c,int m)
    {
        this.p = p;
        this.c = c;
        this.m = m;
    }
    public int getp(){return p;}
    public int getc(){return c;}
    public int getm(){return m;}
    public int calculatetotal(){
        total= p+c+m;
        return total;
    }
    public double calculateavg(){
        double avg= total/3;
        return avg;
    }


}
class info extends Result{
    public void show(){
        System.out.println("Name: " + getname());
        System.out.println("Roll No: "+getroll());
        System.out.println("Branch: "+getbranch());
        System.out.println("Marks Of Physics Chmistry Maths are: "+getp()+" "+getc()+" "+getm());
        System.out.println("Total : "+calculatetotal());
        System.out.println("Average: "+calculateavg());
    }
}
public class MultilevelIn {
    public static void main(String[] args)
    {
       info obj = new info();
       obj.setname("Sushant Jain");
       obj.setroll(60); 
       obj.setbranch("Information Technology");
       obj.setmarks(90, 95, 92);
       obj.show();
    }
}
