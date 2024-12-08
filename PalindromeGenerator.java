import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeGenerator extends JFrame {
    private JTextField inputField, resultField;
    private JButton generateButton;

    public PalindromeGenerator() {
        setTitle("Palindrome Generator");
        setLayout(new FlowLayout());
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter a Number:"));
        inputField = new JTextField(10);
        add(inputField);

        generateButton = new JButton("Generate Palindrome");
        add(generateButton);

        add(new JLabel("Palindrome:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                try {
                    int num = Integer.parseInt(input);
                    int palindrome = findPalindrome(num);
                    resultField.setText(String.valueOf(palindrome));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid number!");
                }
            }
        });

        setVisible(true);
    }

    private int findPalindrome(int num) {
        while (true) {
            if (isPalindrome(num)) return num;
            num++;
        }
    }

    private boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        new PalindromeGenerator();
    }
}
