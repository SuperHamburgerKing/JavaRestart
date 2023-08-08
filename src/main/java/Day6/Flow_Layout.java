package Day6;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout {
    public static void main(String[] args) {
//        step1: 建立一個frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        將布局器改成流水布局器 可設定物件是要居中 從右側開始 或是由左側開始 後面可設定物件間的平行垂直間距
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
//        step2: 建立按鈕或是panel 並加入frame中
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        step3:建一個panel將6個按鈕放進去 並將PANEL放入FRAME
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(300,300));
    }
}
