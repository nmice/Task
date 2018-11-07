package week18;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class SimpleWindow extends JFrame {
    SimpleWindow(){
        super("1С Предприятие: FINEX Decorative Paint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

/*        Box box = Box.createVerticalBox();
        box.add(new JButton());
        box.add(Box.createVerticalStrut(100));
        box.add(new JButton("+"));
        box.add(Box.createVerticalGlue());
        box.add(new JButton("-"));
        box.add(Box.createVerticalStrut(10));
        box.add(new JButton("Прокрастинация"));
        setContentPane(box);
        setSize(800, 600);*/

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3,5,10));
        //panel.add(createPanel(new TitledBorder("Рамка с заголовком"), "TitledBorder"));
        panel.add(createPanel(new LineBorder(Color.ORANGE, 4), "Бездействие"));
        panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), ""));
        panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), ""));
        panel.add(createPanel(new SoftBevelBorder(BevelBorder.RAISED), "Прокрастинация"));
        panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), ""));
        panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), ""));
        setContentPane(panel);
        pack();
        setSize(800, 600);

    }

    private JPanel createPanel(Border border, String text) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton(text));
        panel.setBorder(new CompoundBorder(new EmptyBorder(12,12,12,12), border));
        return panel;
    }
}