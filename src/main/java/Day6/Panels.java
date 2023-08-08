package Day6;

import javax.swing.*;
import java.awt.*;

public class Panels {
//    面板為一容器可放置各種元件如label
public static void main(String[] args) {
    //    step1:先創建frame
    JFrame frame = new JFrame();
    frame.setSize(1000,1000);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
//
    //    step2:創建panel
    JPanel bluepanel = new JPanel();
    bluepanel.setBackground(Color.blue);
    bluepanel.setBounds(400,0,400,400);

//    bluepanel.setLayout(null);

    JPanel redpanel = new JPanel();
    redpanel.setBackground(Color.red);
    redpanel.setBounds(0,0,400,400);


    JPanel greenpanel = new JPanel();
    greenpanel.setBackground(Color.green);
    greenpanel.setBounds(0,400,800,400);
    //   step3: 將panel放進frame
    frame.add(bluepanel);
    frame.add(redpanel);
    frame.add(greenpanel);

//    step4: 創建label 放進panel內 假設放進綠panel
    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("foodp_icon.png");

    label.setIcon(image);
    label.setText("HI");
//    label.setBounds(0,0,100,100);
    greenpanel.add(label);
    }
}
