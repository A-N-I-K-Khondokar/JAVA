import javax.swing.*;

public class ConfirmDialog {
    public static void main(String[] args) {
        int choice=JOptionPane.showConfirmDialog(null,"What will be it?");
        // 0 = YES
        if(choice==0){
            JOptionPane.showMessageDialog(null,"Your choice is YES!");
        }// 1 = NO
        if(choice==1){
            JOptionPane.showMessageDialog(null,"Your choice is NO!");
        }// 2 == Cancel
        if(choice==3){
            JOptionPane.showMessageDialog(null,"Your choice is cancel!");
        }


    }
}
