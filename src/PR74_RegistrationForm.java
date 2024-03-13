import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PR74_RegistrationForm {
    public PR74_RegistrationForm() {
        JFrame registrationFrame = new JFrame("Registration Form");

        // Create labels and text fields for ID, name, and password
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 80, 30);
        JTextField idField = new JTextField();
        idField.setBounds(100, 20, 150, 30);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 60, 80, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(100, 60, 150, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 100, 80, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 100, 150, 30);

        // Create a button to submit the registration
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100, 150, 100, 30);

        // Add components to the frame
        registrationFrame.add(idLabel);
        registrationFrame.add(idField);
        registrationFrame.add(nameLabel);
        registrationFrame.add(nameField);
        registrationFrame.add(passwordLabel);
        registrationFrame.add(passwordField);
        registrationFrame.add(registerButton);

        registrationFrame.setSize(300, 250);
        registrationFrame.setLayout(null);
        registrationFrame.setVisible(true);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input values
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());

                // Create a new user object
                PR73_UsersData user = new PR73_UsersData();
                user.setId(id);
                user.setName(name);
                user.setPassword(password);

                // Save user data to file
                try (FileWriter writer = new FileWriter("users.txt", true)) {
                    writer.write(id + "," + name + "," + password + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                // Display confirmation message
                JOptionPane.showMessageDialog(registrationFrame, "Registration successful!");
            }
        });
    }

    public static void main(String[] args) {
        new PR74_RegistrationForm();
    }
}
