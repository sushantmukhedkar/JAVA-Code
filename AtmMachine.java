import java.util.*;
class Atm{
    synchronized public void check_balance(String name)
    {
        System.out.println("Customer Name: "+name+" "+"Checking Balance");
        try{ Thread.sleep(10);}catch(Exception e){}
        System.out.println("Balance: ");
    }
    synchronized public void with_draw(String name,int amt)
    {
        System.out.println(name+" "+"Withdrawing Amount...");
        try{ Thread.sleep(10);}catch(Exception e){}
        System.out.println("Amount: "+amt+"Successfully Withdraw");
    }
}
class Customer extends Thread
{
    Atm atm_obj;
    String name;
    int amount;
    Customer(String name,Atm a,int amount){
        this.name= name;
        atm_obj = a;
        this.amount=amount;
    }
    public void Use_atm(){
        atm_obj.check_balance(name);
        atm_obj.with_draw(name, amount);
    }
    public void run(){
        Use_atm();
    }
}
public class AtmMachine {
    public static void main(String[] args){
    Atm obj = new Atm();
    Customer c1 = new Customer("Sushant Jain", obj, 5000);
    Customer c2 = new Customer("Koni Nhi", obj, 500);
    c1.start();
    c2.start();
 }
}