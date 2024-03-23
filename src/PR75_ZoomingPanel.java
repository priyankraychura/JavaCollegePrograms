import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class PR75_ZoomingPanel extends JPanel implements MouseWheelListener {
    private double zoomFactor = 1.0;

    public PR75_ZoomingPanel(){
        super();
        setBackground(Color.WHITE);
        addMouseWheelListener(this);
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.scale(zoomFactor, zoomFactor);
        g2d.drawString("Zoom in or zoom out using mouse wheel!", 50, 100);
    }
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int rotation = e.getWheelRotation();
        zoomFactor += rotation * 0.1;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zooming panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        PR75_ZoomingPanel panel = new PR75_ZoomingPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
