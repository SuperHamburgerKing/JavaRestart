package Day6.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("foodp_icon.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(300,300,400,400);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(400,200,150,100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false); //將文字周圍的線清除
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY,Color.BLACK));
        button.setForeground(Color.blue);
//        不能案的按鈕
//        button.setEnabled(false);

//        用this關鍵字調用當前類的方法
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.setResizable(false);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
//            System.out.println("pou");
            label.setVisible(true);
        }
    }
}
