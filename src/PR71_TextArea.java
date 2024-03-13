import javax.swing.*;

public class PR71_TextArea {
    public PR71_TextArea() {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome to java");

        area.setBounds(10, 30, 200, 200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PR71_TextArea();
    }
}
