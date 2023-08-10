package Day7.NewWindow;

import javax.swing.*;

public class NewWindow {

    JFrame frame = new JFrame("new window");
    NewWindow() {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
