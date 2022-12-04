package HomeWork.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFiendButtonListener implements ActionListener {
    private final JTextField inputFiend;

    public ClearFiendButtonListener(JTextField inputFiend){
        this.inputFiend = inputFiend;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inputFiend.setText("");


    }
}
