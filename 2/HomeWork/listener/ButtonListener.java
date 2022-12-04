package HomeWork.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private final JTextField inputFiend;

    public ButtonListener(JTextField inputFiend){
     this.inputFiend = inputFiend;
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        inputFiend.setText(inputFiend.getText() + " " + btn.getText());


    }
}
