import javax.swing.*;

public class PR60_CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox example.");

        JCheckBox checkBox = new JCheckBox("C++");
        checkBox.setBounds(100, 100, 50, 50);
        JCheckBox checkBox2 = new JCheckBox("java", true);
        checkBox2.setBounds(100, 150, 50, 50);

        frame.add(checkBox);
        frame.add(checkBox2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
