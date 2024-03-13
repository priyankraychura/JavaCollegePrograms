import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PR73_LogInForm {
    public PR73_LogInForm() {
        JFrame loginFrame = new JFrame("Password example");

        final JLabel label = new JLabel();
        label.setBounds(20, 150, 250, 50);

        final JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        final  JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);

        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(20, 75, 80, 30);

        JButton b = new JButton("Log In");
        b.setBounds(100, 120, 80, 30);

        loginFrame.add(value);
        loginFrame.add(l1);
        loginFrame.add(l2);
        loginFrame.add(label);
        loginFrame.add(b);
        loginFrame.add(text);
        loginFrame.setSize(300, 300);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PR73_UsersData[] users = new PR73_UsersData[4];
        for (int i=0; i<4; i++){
            users[i] = new PR73_UsersData();
            users[i].setId(i);
            users[i].setName("Priyank " + i);
            users[i].setPassword("pvr" + i);
        }

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = text.getText();
                String enteredPassword = new String(value.getPassword());

                if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
                    label.setText("Username or password is empty");
                    return;
                }

                boolean isAuthenticated = false;
                for (int i = 0; i < 4; i++) {
                    if (enteredUsername.equals(users[i].getName()) && enteredPassword.equals(users[i].getPassword())) {
                        isAuthenticated = true;
                        JFrame welcomeFrame = new JFrame("Welcome " + enteredUsername);
                        JLabel welcomeLabel = new JLabel("Welcome, " + enteredUsername + "!");
                        welcomeLabel.setBounds(10, 5, 250, 80);
                        welcomeFrame.add(welcomeLabel);
                        welcomeFrame.setSize(300, 200);
                        welcomeFrame.setLayout(null);
                        welcomeFrame.setVisible(true);
                        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        loginFrame.dispose();
                        break;
                    }
                }

                if (!isAuthenticated) {
                    label.setText("Incorrect username or password");
                    text.setText("");
                    value.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        new PR73_LogInForm();
    }
}
