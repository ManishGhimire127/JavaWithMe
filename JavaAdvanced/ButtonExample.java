// Create a Frame with a button having caption PRESS ME, once the button is clicked, the caption changes to PRESSED
import java.awt.*;
import java.awt.event.*;
public class ButtonExample {
    public static void main(String[] args) {
        // create instance of frame with the label
        Frame f = new Frame("Button Example");
        // create instance of button with label
        Button b = new Button("PRESS ME");
        // set the position for the button in frame
        b.setBounds(70, 100, 70, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b.setLabel("CODE ON");
            }
        });
        // adding button the frame
        f.add(b);
        // setting size, layout and visibility
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}