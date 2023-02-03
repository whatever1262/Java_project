package HighSchool;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ParabolaSim extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);
    private final JButton back = new JButton();
    // Right side Panel
    private final JPanel rightPanel = new JPanel();
    // Center Panel
    private final JPanel gridContainerPanel = new JPanel();
    // Grid Paper
    private final JPanel gridPaperPanel = new JPanel();
    private final JLabel gridPaperLabel = new JLabel();

    public ParabolaSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        setOptionPanel();
        setGridPaperPanel();
        formula();
        equation();
        option();
        restartAndBack();
    }

    public void setOptionPanel(){
        rightPanel.setPreferredSize(new Dimension(400,0));
        rightPanel.setBackground(new Color(35,47,65));
        rightPanel.setLayout(new GridBagLayout());
        add(rightPanel, BorderLayout.LINE_END);
    }

    public void setGridPaperPanel(){
        gridContainerPanel.setBackground(color);
        gridContainerPanel.setLayout(new GridBagLayout());

        ImageIcon gpIcon = new ImageIcon("src/assets/grid-paper.png");
        gpIcon = new ImageIcon(gpIcon.getImage().
                getScaledInstance(840,840,BufferedImage.SCALE_SMOOTH));
        gridPaperLabel.setIcon(gpIcon);
        gridPaperPanel.add(gridPaperLabel);

        GridBagConstraints customGrid = new GridBagConstraints();

        customGrid.anchor = GridBagConstraints.CENTER;
        gridContainerPanel.add(gridPaperLabel, customGrid);

        add(gridContainerPanel, BorderLayout.CENTER);
    }

    public void formula(){
        JLabel title = new JLabel("Parabola");
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Time New Roman", Font.BOLD, 30));
        title.setPreferredSize(new Dimension(230,87));
        title.setBorder(new LineBorder(Color.white));
        GridBagConstraints customTitle = new GridBagConstraints();
        customTitle.anchor = GridBagConstraints.PAGE_START;
        customTitle.gridx = 0;
        customTitle.gridy = 0;
        customTitle.insets = new Insets(0,0,50,0);
        rightPanel.add(title, customTitle);

        JLabel formula = new JLabel("<html>y = a(x-h)<sup>2</sup>+ k</html>");
        formula.setForeground(Color.white);
        formula.setFont(new Font("Monospaced", Font.BOLD, 35));
        formula.setPreferredSize(new Dimension(330,87));
//        formula.setBorder(new LineBorder(Color.white));
        GridBagConstraints customForm = new GridBagConstraints();
        customForm.anchor = GridBagConstraints.PAGE_START;
        customForm.gridx = 0;
        customForm.gridy = 1;
        customForm.insets = new Insets(0,0,50,0);
        rightPanel.add(formula, customForm);
    }

    public void equation(){
        JLabel containLabel = new JLabel();
        containLabel.setText(" y =   x +   ");
        containLabel.setForeground(Color.white);
        containLabel.setPreferredSize(new Dimension(345,166));
        containLabel.setFont(new Font("Monospaced", Font.BOLD, 40));
        containLabel.setBorder(new LineBorder(Color.white));

        GridBagConstraints customForm = new GridBagConstraints();
        customForm.anchor = GridBagConstraints.CENTER;
        customForm.fill = GridBagConstraints.PAGE_START;
        customForm.gridx = 0;
        customForm.insets = new Insets(0,0,0,0);
        customForm.gridy = 2;
        rightPanel.add(containLabel, customForm);
    }

    public void option(){
        JLabel optionLabel = new JLabel();
        JCheckBox[] checkBox = new JCheckBox[4];

        optionLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10,15));

        for(int i = 0; i < 4; i++){
            checkBox[i] = new JCheckBox();
            checkBox[i].setContentAreaFilled(false);
            checkBox[i].setFocusable(false);
            checkBox[i].setForeground(Color.white);
            checkBox[i].setFont(new Font("Monospaced", Font.BOLD, 30));
        }
        checkBox[0].setText(" y = x");
        checkBox[0].setPreferredSize(new Dimension(200,50));
        checkBox[1].setText(" y = -x");
        checkBox[2].setText(" Hide Background");
        checkBox[3].setText(" Hide Line");

        for(int i = 0; i < 4; i++){
            optionLabel.add(checkBox[i]);
        }

        optionLabel.setPreferredSize(new Dimension(345, 282));
        optionLabel.setBorder(new LineBorder(Color.white));
        GridBagConstraints customForm = new GridBagConstraints();
        customForm.anchor = GridBagConstraints.CENTER;
        customForm.fill = GridBagConstraints.PAGE_START;
        customForm.gridx = 0;
        customForm.insets = new Insets(50,0,0,0);
        customForm.gridy = 3;
        rightPanel.add(optionLabel, customForm);
    }

    public void restartAndBack(){
        JPanel containPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton restart = new JButton();


        containPanel.setPreferredSize(new Dimension(160,118));
//        containPanel.setBorder(new LineBorder(Color.white));
        containPanel.setBackground(new Color(35,47,65));

        GridBagConstraints customForm = new GridBagConstraints();
        customForm.anchor = GridBagConstraints.CENTER;
        customForm.fill = GridBagConstraints.PAGE_START;
        customForm.gridx = 0;
        customForm.gridy = 4;
        customForm.insets = new Insets(40,0,0,0);
        rightPanel.add(containPanel, customForm);

        restart.setText("Restart");
        restart.setPreferredSize(new Dimension(160,45));
        restart.setBorder(new LineBorder(Color.white));
        restart.setFont(new Font("Times New Roman", Font.BOLD, 28));
        restart.setFocusable(false);
        restart.setContentAreaFilled(false);
        restart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        restart.setForeground(Color.white);
        containPanel.add(restart);

        ImageIcon backIcon = new ImageIcon("src/assets/back.png");
        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));
        back.setIcon(backIcon);
        back.setFocusable(false);
        back.setBorderPainted(false);
        back.setLayout(null);
        back.addActionListener(this);
        back.setBorder(new LineBorder(Color.gray));
        back.setContentAreaFilled(false);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        containPanel.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == back){
            Main.Menu.getOptionCard().show(Menu.getMenuPanel(), "Math in High School");
        }
    }

}
