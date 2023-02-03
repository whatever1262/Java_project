package HighSchool;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class LaboratorySim extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);

    JButton backButton = new JButton();

    public LaboratorySim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        option();
        element();
    }

    public void back(){
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(color);
        ImageIcon backIcon = new ImageIcon("src/assets/back.png");
        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));

        backButton.setIcon(backIcon);
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(this);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        topPanel.add(backButton);
        add(topPanel, BorderLayout.PAGE_START);
    }
    public void option(){
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBackground(color);
        rightPanel.setPreferredSize(new Dimension(500, 0));

        JPanel elemType = new JPanel(new FlowLayout(FlowLayout.LEFT, 15,20));
        JPanel reaction = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel tablePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        elemType.setPreferredSize(new Dimension(340,300));
        elemType.setBorder(new LineBorder(Color.black));

        reaction.setPreferredSize(new Dimension(435,300));
        reaction.setBorder(new LineBorder(Color.black));

        // Element Type Radio Button
        JRadioButton solidElem = new JRadioButton("Solid");
        JRadioButton liquidElem = new JRadioButton("Liquid");
        JRadioButton gasElem = new JRadioButton("Gas");
        JRadioButton acidBase = new JRadioButton("Acid & Base");

        solidElem.setFont(new Font("Monospaced", Font.BOLD, 30));
        solidElem.setPreferredSize(new Dimension(200,30));

        liquidElem.setFont(new Font("Monospaced", Font.BOLD, 30));
        liquidElem.setPreferredSize(new Dimension(200,30));

        gasElem.setFont(new Font("Monospaced", Font.BOLD, 30));
        gasElem.setPreferredSize(new Dimension(200,30));

        acidBase.setFont(new Font("Monospaced", Font.BOLD, 30));
        acidBase.setPreferredSize(new Dimension(250,30));
        elemType.add(solidElem);
        elemType.add(liquidElem);
        elemType.add(gasElem);
        elemType.add(acidBase);

        tablePanel.setPreferredSize(new Dimension(300,50));
        elemType.add(tablePanel);

        JButton tableButton = new JButton("Show Table");
        tableButton.setFont(new Font("Monospaced", Font.BOLD, 25));
        tablePanel.add(tableButton);

        GridBagConstraints custom = new GridBagConstraints();
        custom.fill = GridBagConstraints.PAGE_START;
        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(0,0,30,0);
        rightPanel.add(elemType, custom);

        custom.fill = GridBagConstraints.PAGE_START;
        custom.gridy = 1;
        custom.gridx = 0;
        rightPanel.add(reaction, custom);

        JLabel reactionLabel = new JLabel("Reaction");
        reactionLabel.setFont(new Font("Time New Roman", Font.BOLD, 25));
        reaction.add(reactionLabel);

        add(rightPanel, BorderLayout.LINE_END);
    }

    public void element(){
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(color);
        bottomPanel.setPreferredSize(new Dimension(0,155));

        JPanel elemContain = new JPanel(new GridBagLayout());
        elemContain.setPreferredSize(new Dimension(1200, 120));
        elemContain.setBorder(new LineBorder(Color.black));
        elemContain.setBackground(new Color(240,240,240));
        bottomPanel.add(elemContain);

        add(bottomPanel, BorderLayout.PAGE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Main.Menu.getOptionCard().show(Menu.getMenuPanel(), "Chemistry in High School");
        }
    }
}
