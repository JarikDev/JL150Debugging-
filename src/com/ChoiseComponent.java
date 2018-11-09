
package com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChoiseComponent {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new Checkbox("ckeckBoxLabel", true));
        JRadioButton jRadioButton = new JRadioButton("one ");
        JRadioButton jRadioButton2 = new JRadioButton("two ");
        jRadioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton);
        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton2);
        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border, "Border");
        JComboBox<String> jComboBox = new JComboBox();
        jComboBox.addItem("one");
        jComboBox.addItem("two");
        jComboBox.addItem("three");
        jPanel.add(jComboBox);
        jPanel.setBorder(border1);


    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}