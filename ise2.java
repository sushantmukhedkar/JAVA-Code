import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Square extends JFrame implements ActionListener{
    JTextField t1;
    JTextField t2;
    JButton b ;
    JLabel l1;
    JLabel l2;
    public Square(){
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b = new JButton("Calculate");
        l1 = new JLabel("Enter a value of square");
        l2 = new JLabel("=");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,500);
        setDefaultCloseOperation(3);
    }
    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(t1.getText());
        int value = n1*n1;
        t2.setText(value+" ");
}

    public static void main(String[] args){
        Square s = new Square();
}
}