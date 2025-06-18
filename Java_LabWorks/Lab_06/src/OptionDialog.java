import javax.swing.*;
public class OptionDialog {
    public static void main(String[] args) {
        String[] option={"Red","Green","Blue"};
        int choice=JOptionPane.showOptionDialog(null,"Select one","Let's play a game!",0,3,null,option,option[0]);

        if (choice== 0) {
            JOptionPane.showMessageDialog(null, "You chose Red!");
        }
        if (choice== 1) {
            JOptionPane.showMessageDialog(null, "You chose Green.");
        }
        if (choice== 2) {
            JOptionPane.showMessageDialog(null, "You chose Blue!");
        }
    }

}
