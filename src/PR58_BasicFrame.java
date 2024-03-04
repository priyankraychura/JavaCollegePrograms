import javax.swing.*;

public class PR58_BasicFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My firstt frame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
