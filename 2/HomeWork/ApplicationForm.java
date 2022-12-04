package HomeWork;

import HomeWork.components.DigitJButton;
import HomeWork.components.OperatorJButton;
import HomeWork.listener.ButtonListener;
import HomeWork.listener.ClearFiendButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {
    public ApplicationForm(String title){
        super(title);
       setBounds(1700, 1500, 250, 370);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setAlwaysOnTop(true);

setLayout(new BorderLayout());

add(cereateTopPanel(), BorderLayout.NORTH);
        setJMenuBar(createMenu());
        add(cereateCentrPanel(), BorderLayout.CENTER);

    //    add(new Button("Кнопка"), BorderLayout.WEST);

        setVisible(true);
    }
    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        menuFile.addActionListener(new ClearFiendButtonListener(inputFiend));
        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));
        menuFile.add(new JMenuItem("Exit"));

        JMenuItem exit = new JMenuItem("Exit");
exit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
        menuBar.add(exit);

        return  menuBar;
    }
    private JPanel cereateTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField  = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0,8,0));
        inputField.setBackground(new Color(3, 255, 25));

        // inputField.setText("(1+2)/3=12");

        return top;
    }
    private JPanel cereateCentrPanel() {
        JPanel centrPanel = new JPanel();
        centrPanel.setLayout(new BorderLayout());

        ActionListener buttonListern = new ButtonListener(inputFiend);

        centrPanel.add(createDigitsPanel(buttonListern), BorderLayout.CENTER);
        centrPanel.add(createOperatorPanel(buttonListern), BorderLayout.WEST);
        return centrPanel;
    }
    private JPanel createDigitsPanel(ActionListener buttonListern){
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));

       for (int i = 0; i < 10; i++){
           String buttonTitle = (i == 9) ? "0": String.valueOf(i+1);
           JButton btn = new DigitJButton(buttonTitle);
btn.addActionListener(buttonListern);
           digitsPanel.add(btn);
       }

       JButton calc = new OperatorJButton("=");
       digitsPanel.add(calc);
       calc.setEnabled(false);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFiendButtonListener(inputFiend));
        digitsPanel.add(clear);

        return digitsPanel;
    }
private JPanel createOperatorPanel(ActionListener buttonListern){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

    JButton minus = new OperatorJButton("-");
    minus.addActionListener(buttonListern);
    panel.add(minus);

    JButton plus = new OperatorJButton("+");
    plus.addActionListener(buttonListern);
    panel.add(plus);

    JButton multiply = new OperatorJButton("x");
    multiply.addActionListener(buttonListern);
    panel.add(multiply);

    JButton divide = new OperatorJButton("/");
    divide.addActionListener(buttonListern);
    panel.add(divide);

        return panel;
}

}
