package Day8.Select_File;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SelectA_File extends JFrame implements ActionListener {

    JButton button;
    SelectA_File(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        button = new JButton("Select file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JFileChooser chooser = new JFileChooser();
//            System.out.println(chooser.showOpenDialog(null));
//            案open會得到0 案canecl或叉叉會得到1
            int reponse = chooser.showOpenDialog(null);
//            也可以寫== 0 兩種寫法
            if(reponse==JFileChooser.APPROVE_OPTION){
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }
}
