import javax.swing.*;
import java.awt.*;

public class PR64_JFrameWithPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.MAGENTA);

        JLabel jLabel = new JLabel("Hello World");
        panel.add(jLabel);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
