import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PR65_ComboBoxExample {
    JFrame f;

    public PR65_ComboBoxExample() {
        f = new JFrame("ComboBox example");

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String language[] = {"C", "C++", "C#", "Java", "PHP"};

        final JComboBox cb = new JComboBox<>(language);
        cb.setBounds(50, 100, 90, 20);

        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language selected: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new PR65_ComboBoxExample();
    }
}
