import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.*;

                                                                                         
class Akash extends JFrame implements ActionListener
{                                           
    JTextField t1,t2;
    JButton b1;
    JLabel l1;
    JFrame f=new JFrame();
    
    public Akash()
    {
        t1=new JTextField(20);
        t2=new JTextField( 20);
        b1=new JButton("CLICK");
        l1=new JLabel("Result");

        
        add(t1);
        add(t2);
        add(b1);
        add(l1);
        b1.addActionListener((ActionListener) this);
        //b1.createActionListener(this);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
 
    public void actionPerformed(java.awt.event.ActionEvent e) {
             int num1=Integer.parseInt(t1.getText());
             int num2=Integer.parseInt(t2.getText());
    
             int value=num1+num2;
    
             l1.setText(value+"");
        
    }
}

public class Gui
{
    public static void main(String args[])
    {
        Akash a =new Akash();
    }
}