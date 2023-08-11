package Day8.ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {
    JFrame frame = new JFrame();

//    可設定最小值和最大值
    JProgressBar progressBar = new JProgressBar(0,100);

    ProgressBar(){
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(progressBar);
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);//可設定初始值
        progressBar.setFont(new Font("MV Boli",Font.BOLD,25));
        progressBar.setBackground(Color.black);
        progressBar.setForeground(Color.red);
        fill();
    }
    protected void fill(){
        int counter = 0;
        while (counter<=100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter+=1;
        }
        progressBar.setString("DONE! :)");
    }
}
