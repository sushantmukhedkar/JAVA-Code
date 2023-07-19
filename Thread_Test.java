import java.util.*;
class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
        setPriority(MAX_PRIORITY);
      //  setPriority(MIN_PRIORITY);
    }
}
public class Thread_Test {
    public static void main(String[] args)
    {
        Mythread t = new Mythread("MyThread");
        System.out.println("Id:"+ t.getId());
        System.out.println("NAme Of Thread: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State OF thread"+t.getState());
        t.start();
        System.out.println("IS Alive: "+t.isAlive());
        System.out.println("State OF thread"+t.getState());
        System.out.println("IS this Deamon: "+ t.isDaemon());
        System.out.println("Count "+Mythread.activeCount());
    }
    
}
