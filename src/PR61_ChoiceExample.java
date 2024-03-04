import javax.swing.*;
import java.awt.*;

public class PR61_ChoiceExample {
    public PR61_ChoiceExample() {
        JFrame frame = new JFrame("Choice Example.");
        Choice c = new Choice();

        c.setBounds(50, 100, 75, 75);
        c.add("Item1");
        c.add("Item2");
        c.add("Item3");
        c.add("Item4");

        frame.add(c);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        PR61_ChoiceExample js = new PR61_ChoiceExample();
    }
}
