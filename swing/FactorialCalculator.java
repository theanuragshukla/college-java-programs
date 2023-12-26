import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class FactorialCalculator extends JFrame implements ActionListener {
  private JTextField inputField;
  private JLabel resultLabel;

  public FactorialCalculator() {
    // setLayout(new FlowLayout());

    add(new JLabel("Enter a number:"));
    inputField = new JTextField(10);
    add(inputField);

    JButton calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);
    add(calculateButton);

    resultLabel = new JLabel("");
    add(resultLabel);

    setSize(300, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    int number = Integer.parseInt(inputField.getText());
    long result = 1;
    for (int i = 2; i <= number; i++)result *= i;
    resultLabel.setText("Factorial: " + result);
  }

  public static void main(String[] args) {
    new FactorialCalculator();
  }
}
