import javax.swing.*;

public class PR59_ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button example");

        JButton b = new JButton("Click me");
        b.setBounds(50, 100, 95, 30);

        frame.add(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
