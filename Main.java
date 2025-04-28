import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login Form");
        frame.getContentPane().setBackground(new Color(44, 62, 80));
        frame.setSize(440, 455);
        frame.setLayout(null);

        JLabel greet = new JLabel("--Welcome to the login form--");
        greet.setBounds(50, 50, 320, 30);
        greet.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        greet.setForeground(new Color(255, 255, 255));
        frame.add(greet);

        JLabel username = new JLabel("Username*");
        username.setBounds(80, 120, 100, 20);
        username.setFont(new Font("Tahoma", Font.BOLD, 14));
        username.setForeground(new Color(255, 255, 255));
        frame.add(username);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(80, 150, 250, 30);
        usernameField.setBorder(null);
        usernameField.setBackground(new Color(108, 122, 137));
        usernameField.setForeground(new Color(255, 255, 255));
        frame.add(usernameField);

        JLabel password = new JLabel("Password*");
        password.setBounds(80, 200, 100, 20);
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        password.setForeground(new Color(255, 255, 255));
        frame.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(80, 230, 250, 30);
        passwordField.setBorder(null);
        passwordField.setBackground(new Color(108, 122, 137));
        passwordField.setForeground(new Color(255, 255, 255));
        frame.add(passwordField);

        JButton login = new JButton("Login");
        login.setBounds(80, 315, 100, 35);
        login.setBackground(new Color(52, 152, 219));
        login.setForeground(new Color(255, 255, 255));
        frame.add(login);

        JButton exit = new JButton("Exit");
        exit.setBounds(230, 315, 100, 35);
        exit.setBackground(new Color(231, 76, 60));
        exit.setForeground(new Color(255, 255, 255));
        frame.add(exit);

        JCheckBox showPassword = new JCheckBox();
        showPassword.setText("Show Password");
        showPassword.setBounds(200, 275, 130, 18);
        showPassword.setBackground(new Color(108, 122, 137));
        showPassword.setForeground(new Color(255, 255, 255));
        frame.add(showPassword);

        showPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPassword.isSelected()) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('*');
                }
            }
        });

        JLabel footer = new JLabel();
        footer.setText("*All Rights Reserved💀💀");
        footer.setBounds(80, 380, 250, 30);
        footer.setHorizontalAlignment(JLabel.CENTER);
        footer.setForeground(Color.white);
        footer.setBackground(Color.WHITE);
        frame.add(footer);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usernameField.getText().equals("admin")
                        && new String(passwordField.getPassword()).equals("admin")) {
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(exit, "Login Successful");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(exit, "Invalid Credentials");
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}