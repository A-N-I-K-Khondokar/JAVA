import javax.swing.*;
import java.awt.*;
public class MessageDialog {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("/Users/anikkhondokar/Documents/3rd_Sem/JAVA/Tutrle.jpeg");

        //Resizing Image Icon
        Image image= icon.getImage();
        Image resizedImage = image.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        //Using MessageDialog
        JOptionPane.showMessageDialog(null,"this is icon","this is title",JOptionPane.QUESTION_MESSAGE,resizedIcon);

    }
}