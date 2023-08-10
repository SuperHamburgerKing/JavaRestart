package Day7.Texified;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    Myframe(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        button = new JButton("submit");
        textField = new JTextField();
        button.addActionListener(this);
        button.setForeground(Color.blue);
        button.setPreferredSize(new Dimension(80,80));
        textField.setFont(new Font("Comic Sans",Font.BOLD,20));
        textField.setForeground(Color.WHITE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.green);
        textField.setPreferredSize(new Dimension(250,40));
        this.add(button);
        this.add(textField);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Hello "+textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
