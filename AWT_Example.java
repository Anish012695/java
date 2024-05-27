import java.awt.*; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
// Driver Class 
public class AWT_Example { 
// main function 
public static void main(String[] args) 
{ 
// Declaring a Frame and Label 
Frame frame = new Frame("Basic Program"); 
Label label = new Label("Hello World!"); 
label.setAlignment(Label.CENTER); 
 
        // Adding Label and Setting 
        // the Size of the Frame 
        frame.add(label); 
        frame.setSize(100, 100); 
 
        // Making the Frame visible 
        frame.setVisible(true); 
 
        // Using WindowListener for closing the window 
        frame.addWindowListener(new WindowAdapter() { 
            @Override 
            public void windowClosing(WindowEvent e) 
            { 
                System.exit(0); 
            } 
        }); 
    } 
} 