import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import javax.swing.*;

public class FactorialCalculator extends JApplet {
  private JTextField numberField;
  private JTextField resultField;
  private JButton calculateButton;

  public void init() {
    // Create a panel to hold the input and output fields
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2, 2));
    numberField = new JTextField();
    resultField = new JTextField();
    resultField.setEditable(false);
    calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(e -> resultField.setText(factorial(new BigInteger(numberField.getText())).toString()));
    panel.add(new JLabel("Enter a number:"));
    panel.add(numberField);
    panel.add(new JLabel("Factorial:"));
    panel.add(resultField);
    add(panel, BorderLayout.CENTER);
    add(calculateButton, BorderLayout.SOUTH);
  }

  private static BigInteger factorial(BigInteger n) {
    return n.compareTo(BigInteger.ZERO) <= 0 ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }


  public static void main(String[] args){
	  new FactorialCalculator().init();
  }

}
