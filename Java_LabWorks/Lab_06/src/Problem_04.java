import javax.swing.*;
public class Problem_04 {
    public static void main(String[] args) {
       String a=JOptionPane.showInputDialog(null,"Enter a :");
       double x=Double.parseDouble(a);
        String b=JOptionPane.showInputDialog(null,"Enter b :");
        double y=Double.parseDouble(b);
        String c=JOptionPane.showInputDialog(null,"Enter c :");
        double z=Double.parseDouble(c);

        double s=(x+y+z)/2;
        double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));

        JOptionPane.showMessageDialog(null,"Area is : "+area,"Area is",JOptionPane.INFORMATION_MESSAGE);
    }
}
