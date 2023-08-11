package Day8.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JLabel label;
    JSlider slider;
    JPanel panel;
    SliderDemo(){
        frame = new JFrame();
        label = new JLabel();
        panel = new JPanel();
//        panel預設為 flowlayout 可加可不加
        panel.setLayout(new FlowLayout());
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
//        將滑快方向設置為垂直或水平
        slider.setOrientation(SwingConstants.VERTICAL);
//        確認是否在滑快上繪製刻度和滑道
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
//        設置主刻度和次刻度的間隔
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
//        確認是否在滑道上繪製標籤
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,25));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        slider.addChangeListener(this);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setText(slider.getValue()+"°C");
        panel.add(slider);
        panel.add(label);
        frame.add(panel);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue()+"°C");
    }
}
