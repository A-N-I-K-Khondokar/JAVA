import javax.swing.*;
public class InputDialog {
    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog(null,"Enter Your name :","Name input",JOptionPane.QUESTION_MESSAGE);

        if(name==null){
            JOptionPane.showMessageDialog(null,"You didn't enter a name","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Hello"+name+"!" ,"greeting",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
