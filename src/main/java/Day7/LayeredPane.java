package Day7;

import javax.swing.*;
import java.awt.*;

public class LayeredPane {
//    可做圖層堆疊 為容器增加了深度 將元件放入可用wraping class(Interger.valueof(i))指定要放第幾層 數字越大越前面
    public static void main(String[] args) {
//      step1:建frame
        JFrame frame = new JFrame("LayeredPane");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
//        step2:建layerpane 並加入frame中
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);
        layeredPane.setBounds(0,0,500,500);
        frame.add(layeredPane);
//       step3: 建三個label放進layerpane進行堆疊
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        label1.setBackground(Color.BLUE);
        label1.setBounds(50,50,200,200);
//        一定要將不透明設置為true 該元件才會繪製邊界內所有圖元，若設置為false 為透明可顯現下方元件
        label1.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);
        label2.setOpaque(true);
        label3.setBackground(Color.RED);
        label3.setBounds(150,150,200,200);
        label3.setOpaque(true);

        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(1));
        layeredPane.add(label3,Integer.valueOf(2));

    }
}
