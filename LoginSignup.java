import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PasswordException extends Exception{
    public String toString(){
        return "Invalid Password Please Try Again!!!";
    }
}
class UserNameException extends Exception{
    public String toString(){
        return "Invalid Username Please Try Again!!!";
    }
}
class info {
    private String email;
    private String pass;
    private String Username;
    Scanner sc = new Scanner(System.in);
    public void Login(){
        System.out.println("Enter email: ");
        email = sc.next();
        System.out.println("Enter UserName: ");
        Username = sc.next();
        System.out.println("Enter Passeord MIN 8 Character: ");
        validate();
    }
    public void validate(){
        String regex ="[A-Za-z]\\w{5, 29}$";
        String regex1 ="^[A-Za-z0-9+_.-]+@(.+)$";
       String passregex ="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$";
        Pattern p = Pattern.compile(regex);
        Pattern p1 = Pattern.compile(regex1);
        Pattern password = Pattern.compile(passregex);
        Matcher m = p.matcher(Username);
        Matcher pm = password.matcher(pass);
        Matcher m1 = p1.matcher(email);
        if(m.matches()==false)
          {System.out.println("Enter Valid Username");}
        if(m1.matches()==false)
           System.out.println("Enter Valid Email");
       if(pm.matches()== false)
          System.out.println("Enter Strong PassWord");

    }
    public void Signup()throws Exception{
        System.out.println("Enter Your Username");
        String userinput = sc.next();
        if(Username.equals(userinput)==false)
        {
            throw new UserNameException();
        }
        else{
            System.out.println("Enter Correct Password: ");
            String passinput = sc.next();
            if(pass.equals(passinput)==false){
                throw new PasswordException();
            }
            else{
                System.out.println("Welcome Back, "+Username);
            }
        }

    }

}
public class LoginSignup {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        info obj = new info();
        System.out.println("Enter 1 for Login ACC and 2 For Signup ACC::");
        int a = s.nextInt();
        while(a<3 && a!=0){
            if(a==1){
                obj.Login();
            }
            else if(a==2){
                try{
                    obj.Signup();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    
}
