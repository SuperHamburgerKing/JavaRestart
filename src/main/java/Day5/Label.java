package Day5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//創建一個邊框 可自訂顏色和寬度
        Border border = BorderFactory.createLineBorder(Color.blue,3);
//        創建一個標籤
        JLabel label = new JLabel();
        frame.add(label);
        label.setText("Hello world");//新增文字標籤
        ImageIcon mage = new ImageIcon("foodp_icon.png");
//        將圖片加入
        label.setIcon(mage);
//        將邊框加入
        label.setBorder(border);
        label.setHorizontalTextPosition(JLabel.CENTER);//設定以圖片為基準文字的水平位置
        label.setVerticalTextPosition(JLabel.TOP);//設定以圖片為基準文字的垂直位置
        label.setForeground(Color.GREEN);//文字的艷色
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//文字的字體斜體大小
//        設定標籤背景前須將Opaque設定為true 邊框內的背景才能上色
        label.setBackground(Color.blue);
        label.setOpaque(true);
//         圖片+文字位在整個label的哪個位置
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
//          一般label為整個frame加入以下便可限制label的大小可自訂而不是整個frame
//        frame.setLayout(null);
//        自訂label在frame中的位置 (x,y,長,寬)
//        label.setBounds(0,0,400,400);
//        可直接依照label(圖+文字)的大小自動包裹成一個滿frame的圖示
        frame.pack();



    }
}
