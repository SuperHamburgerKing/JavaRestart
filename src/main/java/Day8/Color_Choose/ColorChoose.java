package Day8.Color_Choose;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChoose extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    ColorChoose(){
//        super("Color");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        button = new JButton("Choose color");
        button.addActionListener(this);
        label = new JLabel();
        label.setText("Hello world");
        label.setFont(new Font("MV Boli",Font.PLAIN,25));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Color",Color.BLACK);
            label.setBackground(color);
        }
    }
}
