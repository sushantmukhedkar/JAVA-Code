import java.beans.Customizer;
import java.util.*;
interface Member{
    public void callback();
}
class Customer implements Member{
    private String name;
    Customer(String name){
        this.name= name;
    }
    public void callback(){
        System.out.println("I will Call Back to "+name);
    }
}
class Store{
    Member m[] = new Member[100];
    int count=0;
    void register(Member me){
        m[count++]= me;
    }
    void invitesale(){
        for (int i = 0; i < count; i++) {
           m[i].callback();   
        }
    }
}
public class InterfaceExample {
    public static void main(String[] args){
        Store s = new Store();
        Customer c1 = new Customer("Sushant");
        Customer c2 = new Customer("Jain");
        s.register(c1);
        s.register(c2);
        s.invitesale();


    }
    
}
