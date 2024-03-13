import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PR69_PasswordField {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password example");

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



        f.add(value);
        f.add(l1);
        f.add(l2);
        f.add(label);
        f.add(b);
        f.add(text);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + text.getText();
                data +=" Password: " + new String(value.getPassword());
                label.setText(data);
            }
        });
    }
}
