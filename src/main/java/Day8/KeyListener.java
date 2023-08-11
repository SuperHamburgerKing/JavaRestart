package Day8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {

    ImageIcon icon;
    JLabel label;
    KeyListener(){
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        label = new JLabel();
        label.setOpaque(true);
//        label.setBackground(Color.RED);
        icon = new ImageIcon("foodp_icon.png");
        label.setIcon(icon);

        this.addKeyListener(this);
        label.setBounds(0,0,200,200);
        this.add(label);
    }
    @Override
    public void keyTyped(KeyEvent e) {
//接收鍵盤的輸入char值 可根據不同輸入做不同功能
        switch(e.getKeyChar()){
            case'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
            break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//使用keycode作為輸出 鍵盤上每個案件都有其對應的 數字
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 39:label.setLocation(label.getX(),label.getY()+10);
                break;
            case 40:label.setLocation(label.getX()+10,label.getY());
                break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
                break;
    }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
    }
}
