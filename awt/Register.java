import java.awt.*;
import java.awt.event.*;

public class Register {
  private Frame mainFrame;
  private Label headerLabel;
  private Label statusLabel;
  private Panel controlPanel;

  public Register() {
    prepareGUI();
  }

  public static void main(String[] args) {
    SignupForm signupForm = new SignupForm();
    signupForm.showEvent();
  }

  private void prepareGUI() {
    mainFrame = new Frame("Signup Form");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));

    headerLabel = new Label();
    headerLabel.setAlignment(Label.CENTER);

    statusLabel = new Label();
    statusLabel.setAlignment(Label.CENTER);
    statusLabel.setSize(350, 100);

    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
      }
    });

    controlPanel = new Panel();
    controlPanel.setLayout(new FlowLayout());

    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);
  }

  private void showEvent() {
    headerLabel.setText("Signup Form");

    Label nameLabel = new Label("Name: ", Label.RIGHT);
    Label emailLabel = new Label("Email: ", Label.RIGHT);
    Label passwordLabel = new Label("Password: ", Label.RIGHT);
    Label rollNumberLabel = new Label("Roll Number: ", Label.RIGHT);
    Label sectionLabel = new Label("Section: ", Label.RIGHT);
    Label courseLabel = new Label("Course: ", Label.RIGHT);

    final TextField nameField = new TextField(6);
    final TextField emailField = new TextField(6);
    final TextField passwordField = new TextField(6);
    final TextField rollNumberField = new TextField(6);
    final TextField sectionField = new TextField(6);
    final TextField courseField = new TextField(6);

    Button signupButton = new Button("Signup");

    signupButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String rollNumber = rollNumberField.getText();
        String section = sectionField.getText();
        String course = courseField.getText();

        statusLabel.setText("Signup Successful!");
      }
    });

    controlPanel.add(nameLabel);
    controlPanel.add(nameField);
    controlPanel.add(emailLabel);
    controlPanel.add(emailField);
    controlPanel.add(passwordLabel);
    controlPanel.add(passwordField);
    controlPanel.add(signupButton);

  }}
