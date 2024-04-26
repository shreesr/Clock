import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {
    private JLabel timeLabel;

    public DigitalClock() {
        // Set the title of the window
        setTitle("Digital Clock");

        // Set the layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Initialize the time label
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        
        // Add the time label to the frame
        add(timeLabel, BorderLayout.CENTER);

        // Set the window size and make it visible
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Start the clock
        startClock();
    }

    private void startClock() {
        // Create a timer that updates the time label every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        // Get the current time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());

        // Update the time label
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        // Create an instance of the DigitalClock class
        new DigitalClock();
    }
}
