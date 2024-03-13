import javax.swing.*;
import java.awt.*;

public class PR66_ScrollPaneDemo extends JFrame {
    public PR66_ScrollPaneDemo() {
        super("ScrollPanel Demo");
        ImageIcon img = new ImageIcon("book2.png");
        JScrollPane sp = new JScrollPane(new JLabel(img));

        getContentPane().add(sp);
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PR66_ScrollPaneDemo();
    }
}
