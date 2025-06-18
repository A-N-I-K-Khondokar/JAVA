
import javax.swing.JOptionPane;

public class Problem_02 {
    public static void main(String[] args) {
        // Get radius input from the user
        String radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle:");
        int radius = Integer.parseInt(radiusStr);

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display results
        JOptionPane.showMessageDialog(null, "Radius: " + radius +
                        "\nCircumference: " + circumference +
                        "\nArea: " + area,
                "Circle Calculations",JOptionPane.INFORMATION_MESSAGE);
    }
}
