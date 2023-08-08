package Day5;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.awt.*;
import java.util.concurrent.Callable;
import javax.swing.*;

public class GUI {
    public static void main(String[] args) throws LineUnavailableException {
        JFrame frame = new JFrame();//建立一個視窗
        frame.setVisible(true);//設定可看見此視窗
        frame.setTitle("遊戲視窗");
        frame.setResizable(false);//打開後不可手動調整視窗大小
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//當按下叉叉即停止此程序不在後台運作，預設只會隱藏視窗但程式還在後台運作
        frame.getContentPane().setBackground(new Color(21,43,77));//設定視窗背景顏色可給rgb或給16進制值
        ImageIcon mage =new ImageIcon("GOOD.png");
        frame.setIconImage(mage.getImage());//更換視窗圖標預設是java圖案
    }
}
