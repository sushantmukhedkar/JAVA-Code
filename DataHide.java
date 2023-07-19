import java.util.*;
class sj {
    private String name;
    private int roll;
    static int i=0;
    private int m1;
    private int m2;
    private int m3;
    sj(String name,int m1,int m2,int m3){
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public String getname(){return name;}
    public int getm1(){return m1;}
    public int getm2(){return m2;}
    public int getm3(){return m3;}
    public int total()
    {
        int total = getm1()+getm2()+getm3();
        return total;
    }
    public String tostring() {
        return "Name: "+name+"\n"+"Roll: "+(i+1)+"\n"+total();
    }
}
public class DataHide {
    public static void main(String[] args) {
        sj s1 = new sj("Sush",80,90,70);
        System.out.println(s1);
    }
    
}
