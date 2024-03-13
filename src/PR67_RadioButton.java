import javax.swing.*;

public class PR67_RadioButton {
    JFrame f;
    public PR67_RadioButton(){
        f = new JFrame();
        JRadioButton r1 = new JRadioButton("A) Male");
        r1.setBounds(75, 50, 100, 30);

        JRadioButton r2 = new JRadioButton("B) Female");
        r2.setBounds(75, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PR67_RadioButton();
    }
}
