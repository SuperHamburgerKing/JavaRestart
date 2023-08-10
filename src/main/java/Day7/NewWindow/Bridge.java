package Day7.NewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bridge implements ActionListener {
    JFrame frame = new JFrame("USER");
    JButton button = new JButton("click me");
    Bridge(){
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        button.setForeground(Color.blue);
        button.setBackground(Color.gray);
        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            frame.dispose();
            new NewWindow();
        }
    }
}
