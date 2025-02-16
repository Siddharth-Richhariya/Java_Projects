import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private int count = 0; // Counter variable
    private JLabel label;

    public CounterApp() {
        // Create JFrame (window)
        JFrame frame = new JFrame("Counter App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create label to display count
        label = new JLabel("Count: " + count);
        label.setBounds(120, 50, 100, 30);
        frame.add(label);

        // Create button
        JButton button = new JButton("Run");
        button.setBounds(100, 100, 100, 30);
        frame.add(button);

        // Add action listener to increase count when button is clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++; // Increment count
                label.setText("Count: " + count); // Update label
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
