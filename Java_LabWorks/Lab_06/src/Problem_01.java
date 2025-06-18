import javax.swing.JOptionPane;

public class Problem_01 {
    public static void main(String[] args) {
        // Get first number from user
        String num1Str = JOptionPane.showInputDialog("Enter first number:");
        int num1 = Integer.parseInt(num1Str);

        // Get second number from user
        String num2Str = JOptionPane.showInputDialog("Enter second number:");
        int num2 = Integer.parseInt(num2Str);

        // Calculate sum
        int sum = num1 + num2;

        // Display result in a message dialog
        JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Addition Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
