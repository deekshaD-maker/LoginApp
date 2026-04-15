import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");

        // Background
        frame.getContentPane().setBackground(new Color(230, 240, 255));
        frame.setLayout(null);

        // Title
        JLabel title = new JLabel("LOGIN SYSTEM");
        title.setBounds(120, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(new Color(0, 102, 204));

        // Username
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 70, 100, 30);

        JTextField userField = new JTextField();
        userField.setBounds(150, 70, 170, 30);

        // Password
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 100, 30);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 120, 170, 30);

        // Button
        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(130, 180, 120, 35);
        loginBtn.setBackground(new Color(0, 102, 204));
        loginBtn.setForeground(Color.WHITE);

        // Action
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = userField.getText();
                String pass = new String(passField.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(frame,
                            "Login Successful ✅");
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Invalid Credentials ❌");
                }
            }
        });

        // Add components
        frame.add(title);
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}