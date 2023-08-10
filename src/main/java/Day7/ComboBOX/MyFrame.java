package Day7.ComboBOX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        String[] animals = {"bird","cat","dog"};
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);
//        有用的方法
//        comboBox.setEditable(true); //可在下拉欄輸入要選的對象
//        comboBox.getItemCount(); //可知道下拉欄中有多少物件可選
//        comboBox.addItem("horse"); //可新增動物進去
//        comboBox.insertItemAt("horse",0); //將索引0的位置插入horse
//        comboBox.setSelectedIndex(0); //設定一一開始先選定索引0的動物
//        comboBox.remove(0); //刪除索引0位置的動物
//        comboBox.removeAllItems(); //刪除所有動物
//        comboBox.removeItem("bird"); //刪除特定動物
        this.add(comboBox);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
