import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PR63_SimpleImageViewer extends JFrame implements ActionListener {
    private final JLabel imageLabel = new JLabel();
    private final JButton chooseButton = new JButton("Choose Image");
    public PR63_SimpleImageViewer() {
        super("Simple Image Viewer");
        setLayout(new BorderLayout());

        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        chooseButton.addActionListener(this);
        add(chooseButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
            imageLabel.setIcon(imageIcon);
            pack();
        }
    }
    public static void main(String[] args) {
        new PR63_SimpleImageViewer();
    }
}
