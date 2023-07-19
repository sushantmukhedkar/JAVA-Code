import java.util.*;
class Mythread extends Thread{
    public void run(){
        int count=0;
        while(true){
            System.out.println(count);
            count++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Thread_Sleep_Test {
    public static void main(String[] args){
        Mythread t = new Mythread();
        t.start();
        t.interrupt();
    }
    
}
