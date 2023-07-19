import java.util.*;
class Myanno{
    @Deprecated
    public void display(){
        System.out.println("....");
    }
}
public class Annotation {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args){
        Myanno obj = new Myanno();
        obj.display();
    }
}
