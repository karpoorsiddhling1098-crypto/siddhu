import javax.swing.*;
import java.awt.*;

public class DashboradPage extends JFrame {
    public DashboradPage(String farmerName, String location) {
        setTitle("Farmer Dashboard");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel welcomeLabel = new JLabel("Welcome, " + farmerName + "!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel locationLabel = new JLabel("Your location: " + location, SwingConstants.CENTER);
        locationLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        panel.add(welcomeLabel);
        panel.add(locationLabel);

        add(panel);
    }
}
