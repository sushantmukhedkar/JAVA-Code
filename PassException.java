import java.util.*;
class PasswordException extends Exception{
    public String toString(){
        return "Invalid Password Please Try Again!!!";
    }
}
public class PassException {
    public static void main(String[] a){
        try{
        String pass ="Sush@505";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String su = s.next();
        if(pass.equals(su)==false)
        {
            throw new PasswordException();
        }
        else 
          System.out.println("Welcome!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}
