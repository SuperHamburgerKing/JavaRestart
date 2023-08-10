package Day7.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton button1;
    JRadioButton button2;
    JRadioButton button3;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        button1 = new JRadioButton("pizza");
        button1.addActionListener(this);
        button2 = new JRadioButton("hamburger");
        button2.addActionListener(this);
        button3 = new JRadioButton("hotdog");
        button3.addActionListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            System.out.println("pizza");
        } else if (e.getSource()==button2) {
            System.out.println("hamburger");
        }else {
            System.out.println("hotdog");
    }
    }
}
