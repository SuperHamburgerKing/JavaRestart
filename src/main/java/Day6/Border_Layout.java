package Day6;

import javax.swing.*;
import java.awt.*;

// "FRAME" 若是使用絕對布局 如layout(null)，則"PANEL"用setsize()設定大小，若是"FRAME使用邊緣式布局
// 則"PANEL"用setpreferredsize()設定大小
public class Border_Layout {
    public static void main(String[] args) {
//        step1: 創建即設定一個frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        預設就是此布局器 可加可不加
//        可在borderlayout內加入 各panel之間長寬的間隙是多少
        frame.setLayout(new BorderLayout(10,10));
//        step2:創建5個panel放進frame 設定其顏色
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.gray);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.green);
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.pink);
//        step3: 設定五個label的長和寬
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
//        step4:將label放進frame中
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
//       step5:在中間的panel中再加入四條panels
        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.black);
        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.CYAN);
        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.cyan);
        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.ORANGE);
//       step6: 將panel5(中間的panel) 是唯一容器裝入新的四個panel 因此需設定其layout
        panel5.setLayout(new BorderLayout());
//       step7: 設定新的panel的長寬
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
//       step8:將新的四個panel裝入 panel5中
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.EAST);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.SOUTH);
    }
}
