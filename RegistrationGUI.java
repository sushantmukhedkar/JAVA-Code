import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationGUI extends JFrame implements ActionListener {
    // Create labels for each field
    JLabel nameLabel = new JLabel("Name:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel dobLabel = new JLabel("Date of Birth:");

    // Create text fields for each field
    JTextField nameField = new JTextField(20);
    JTextField emailField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JTextField dobField = new JTextField(20);

    // Create a button to submit the form
    JButton submitButton = new JButton("Submit");

    public RegistrationGUI() {
        // Set the title of the window
        setTitle("Registration Form");

        // Set the layout manager for the window
        setLayout(new GridBagLayout());

        // Add the labels and text fields to the window
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        add(nameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        add(nameField, c);

        c.gridx = 0;
        c.gridy = 1;
        add(emailLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(emailField, c);

        c.gridx = 0;
        c.gridy = 2;
        add(passwordLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        add(passwordField, c);

        c.gridx = 0;
        c.gridy = 3;
        add(dobLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        add(dobField, c);

        // Add the submit button to the window
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        add(submitButton, c);
        // Add an action listener to the submit button
        submitButton.addActionListener(this);

        // Set the size and visibility of the window
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the values of the fields and display them in a dialog box
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String dob = dobField.getText();

        String message = "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Password: " + password + "\n"
                + "Date of Birth: " + dob + "\n";

        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new RegistrationGUI();
    }

    @Exam
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}


