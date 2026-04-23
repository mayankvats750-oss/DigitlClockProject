import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Digitalclock extends JFrame {

    private JLabel timeLabel;

    public digitalclock() {
        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create label
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(timeLabel);

        // Timer to update time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        updateTime(); // initial call
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new digitalclock().setVisible(true);
        }); 
    } 
}