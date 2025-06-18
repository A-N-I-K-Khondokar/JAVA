
import javax.swing.JOptionPane;

public class Problem_03 {
    public static void main(String[] args) {
        // Get breadth input
        String breadthStr = JOptionPane.showInputDialog("Enter the breadth of the rectangle:");
        double breadth = Double.parseDouble(breadthStr);

        // Get height input
        String heightStr = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        double height = Double.parseDouble(heightStr);

        // Calculate area
        double area = breadth * height;

        // Display result
        JOptionPane.showMessageDialog(null, "Breadth: " + breadth +
                        "\nHeight: " + height +
                        "\nArea of Rectangle: " + area,
                "Rectangle Area", JOptionPane.INFORMATION_MESSAGE);
    }
}
