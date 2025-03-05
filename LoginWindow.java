package student.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Login Window");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);
        
        // Call method to place components in the panel
        placeComponents(panel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel WelcomeLabel = new JLabel("HUSWENG STUDENT MANAGEMENT");
        WelcomeLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18));
        WelcomeLabel.setBounds(75, 20, 400, 40);
        panel.add(WelcomeLabel);
        
        // Create Username Label and TextField
        JLabel userLabel = new JLabel("USERNAME: ");
        userLabel.setBounds(60, 80, 180, 25);
        userLabel.setBackground(new java.awt.Color(0, 204, 0));
        userLabel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); 
        userLabel.setText("USERNAME");
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(180, 75, 165, 30);
        userText.setBackground(new java.awt.Color(255, 204, 0));
        userText.setFont(new java.awt.Font("Bahnschrift", 1, 14));
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 5, true));
        panel.add(userText);
        
        
        // Create Password Label and PasswordField
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(60, 115, 180, 25);
        passwordLabel.setBackground(new java.awt.Color(0, 204, 0));
        passwordLabel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        passwordLabel.setText("PASSWORD");
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(180, 110, 165, 30);
        passwordText.setToolTipText("");
        passwordText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 5, true));
        passwordText.setSelectionColor(new java.awt.Color(153, 255, 0));
        panel.add(passwordText);
        
        // Create Login Button and its ActionListener
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(75, 158, 255, 30);
        loginButton.setBackground(new java.awt.Color(0, 204, 51));
        loginButton.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 5, true));
        panel.add(loginButton);
        
        JLabel noteLabel = new JLabel("NOTE:  ENTER YOUR USERNAME AND PASSWORD");
        noteLabel.setFont(new java.awt.Font("Bahnschrift", 0, 14));
        noteLabel.setBounds(40, 225, 400, 40);
        panel.add(noteLabel);
        
        // Action when login button is clicked
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(panel, "Login Successful!");
                    // Here you can add code to open the Dashboard Window
                } else {
                    JOptionPane.showMessageDialog(panel, "Invalid credentials");
                }
            }
        });
        
    }
}
