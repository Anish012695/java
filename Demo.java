import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demo implements ActionListener{
    Frame F ;
    TextField T1,T2,T3;
    Button B;
    Demo(){
        F=new Frame("additoin");
        T1=new TextField();
        T2=new TextField();
        T3=new TextField();
        Button B=new Button("add");
        B.addActionListener(this);
        F.add(T1);
        F.add(T2);
        F.add(T3);
        F.add(B);
        F.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int a =Integer.parseInt(T1.getText());
        int b =Integer.parseInt(T2.getText());
        if(e.getSource()==B){
        int c=a+b;
        T3.setText("adding"+c);
        }
    }
    public static void main(String[] args) {
        new Demo();
    }
}
