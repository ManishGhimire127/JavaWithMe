// Create a swing that has two buttons named alpha and beta. When either of the buttons pressed
// it should display “Alpha is pressed” or : Beta is pressed”
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ButtonDemo implements ActionListener {
    JLabel jlab;
    JButton jbtnA;
    JButton jbtnB;
    ButtonDemo() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Button Example");
        // Set the layout manager to FlowLayout. 
        jfrm.setLayout(new FlowLayout());
        // Give the frame an initial size. 
        jfrm.setSize(220, 90);
        // Terminate the program when the user closes the application. 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a label. 
        jlab = new JLabel("Press a button.");
        // Make two buttons. 
        jbtnA = new JButton("Alpha");
        jbtnB = new JButton("Beta");
        // Add action listeners. 
        jbtnA.addActionListener(this);
        jbtnB.addActionListener(this);
        // Add the buttons and label to the content pane. 
        jfrm.add(jbtnA);
        jfrm.add(jbtnB);
        jfrm.add(jlab);
        // Display the frame. 
        jfrm.setVisible(true);
    }
    // Handle button events. 
    public void actionPerformed(ActionEvent ae)
    {
        String ac = ae.getActionCommand();

        // See which button was pressed. 
        if(ac.equals("Alpha"))
        {
            jlab.setText("Alpha pressed");
            jbtnB.setEnabled(true);
        } else if (ac.equals("Beta"))
            jlab.setText("Beta pressed.");
        else
            jlab.setText("Press any button");
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread. 
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                new ButtonDemo();
            }
        });
}
}