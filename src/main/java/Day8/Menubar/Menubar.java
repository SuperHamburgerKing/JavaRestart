package Day8.Menubar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file;
    JMenu edit;
    JMenu help;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;

    Menubar(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
        menuBar = new JMenuBar();
        load = new JMenuItem("load");
        save = new JMenuItem("save");
        exit = new JMenuItem("exit");
        this.setJMenuBar(menuBar);
        file = new JMenu("file");
        edit = new JMenu("edit");
        help = new JMenu("help");
        file.add(load);
        file.add(save);
        file.add(exit);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
//        設置註記符(快捷鍵)
        load.setMnemonic(KeyEvent.VK_L); //案alt+L即可選取
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);

        file.setMnemonic(KeyEvent.VK_F); //案alt+f可選取
        edit.setMnemonic(KeyEvent.VK_T);
        help.setMnemonic(KeyEvent.VK_H);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==load){
            System.out.println("load load load");
        } else if (e.getSource()==save) {
            System.out.println("save save save");
        } else if (e.getSource()==exit) {
            System.exit(0);
        }
    }
}
