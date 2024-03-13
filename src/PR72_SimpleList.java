import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PR72_SimpleList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Example");
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};
        JList list = new JList<>(fruits);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data = (String) list.getSelectedValue();
                System.out.println(data);
            }
        });

        frame.add(list);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
