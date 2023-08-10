package Day7.CheckBox;

import org.slf4j.IMarkerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JButton button;
    ImageIcon image;
    ImageIcon image2;
    JCheckBox checkBox;
    Myframe(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        checkBox = new JCheckBox();
        checkBox.setText("Are you a human?");
        button = new JButton("submit");
        button.setFocusable(false);
        button.addActionListener(this);
        image = new ImageIcon("下載.png");
        image2 = new ImageIcon("叉叉.jpg");
        checkBox.setIcon(image2);
        checkBox.setSelectedIcon(image);
        this.add(button);
        this.add(checkBox);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
