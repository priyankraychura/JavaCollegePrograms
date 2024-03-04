import javax.swing.*;
import java.awt.*;

public class PR62_FlowLayout {
    JFrame frameObj;
    public PR62_FlowLayout() {
        frameObj = new JFrame("Flow Layout example");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");

        frameObj.add(b1);
        frameObj.add(b2);
        frameObj.add(b3);
        frameObj.add(b4);
        frameObj.add(b5);
        frameObj.add(b6);
        frameObj.add(b7);
        frameObj.add(b8);
        frameObj.add(b9);
        frameObj.add(b10);

        //Buttons created using loop
        for (int i = 11; i <= 15; i++) {
            JButton button = new JButton(Integer.toString(i));
            frameObj.add(button);
        }

        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObj.setLayout(new FlowLayout());
        frameObj.setSize(400, 300);
        frameObj.setVisible(true);
    }

    public static void main(String[] args) {
        PR62_FlowLayout js = new PR62_FlowLayout();
    }
}
