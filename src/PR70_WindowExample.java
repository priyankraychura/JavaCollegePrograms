import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PR70_WindowExample extends JFrame implements WindowListener {
    public PR70_WindowExample() {
        addWindowListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PR70_WindowExample();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("DisIconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("DeActivated");
    }
}
