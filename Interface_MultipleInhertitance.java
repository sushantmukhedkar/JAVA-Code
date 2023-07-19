import java.util.*;
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void Pause();
    void Play();
}
class Phone {
    Scanner scan = new Scanner(System.in); 
    public void dial(){
        System.out.println("Enter No....:");
        int N = scan.nextInt();
        System.out.println("Calling the No...:"+N);
    }
    public void call_by_name(){
        String name = scan.next();
        System.out.println("Calling .... "+ name);
    }
}
class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void features(){
        System.out.println("Nothing");
    }
    public void click(){System.out.println("Clicking Photograph....");}
    public void record(){System.out.println("Recording The Video....");}
    public void Pause(){System.out.println("Pause the Music....");}
    public void Play(){System.out.println("Play the Music....");}
}

public class Interface_MultipleInheritance{
    public static void main(String[] args){
        SmartPhone s1 = new SmartPhone();
        Camera c = new SmartPhone();
        Phone p = new SmartPhone();
        MusicPlayer m = new SmartPhone();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Character For SmartPhone - 1\n For PhoneApp - 2\n For CameraApp - 3\n For MusicPlayer - 4\n");
        int X = s.nextInt();
        if(X==1){
            System.out.println("Enter Character For using Feature..\n For ExtraFeature-1\n for Click Photo-2\n for Recordvideo-3\nfor PlayMusic-4");
            int ch = s.nextInt();
            switch (ch) {
                case '1':
                    s1.features();
                    break;
                case '2':
                    s1.click();
                    break;
                case '3':
                    s1.record();
                    break;
                case '4':
                    s1.Play();
                    break;
                default:
                    break;
            }
        }
        if(X==2){
            System.out.println("For Dial-1\n By Name -2\n");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    p.dial();
                    break;
                case 2:
                    p.call_by_name();
                    break;
                default:
                    break;
            }
        }
        if(X==3){
            System.out.println("For Click-1\n For Record -2\n");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    c.click();
                    break;
                case 2:
                    c.record();
                    break;
                default:
                    break;
            }
        }
        if(X==4){
            System.out.println("For Play-1\n For Pause -2\n");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    m.Play();
                    break;
                case 2:
                    m.Pause();
                    break;
                default:
                    break;
            }
        }
    }
}
