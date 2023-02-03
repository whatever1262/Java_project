package Elementary;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class FractionSim extends JPanel implements ActionListener {

    Color color = new Color(214, 255, 253);
    GridBagConstraints custom = new GridBagConstraints();
    private final JButton backButton = new JButton();

    public FractionSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        incAndDec();
        items();
        fraction();
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
        backButton.setLayout(null);
        backButton.setBorder(new LineBorder(Color.gray));
        backButton.setContentAreaFilled(false);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(this);
        topPanel.add(backButton);

        add(topPanel, BorderLayout.PAGE_START);
    }

    public void incAndDec(){
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setPreferredSize(new Dimension(215,0));
        rightPanel.setBackground(color);

        JPanel fraNumPanel = new JPanel();
        fraNumPanel.setLayout(new BoxLayout(fraNumPanel, BoxLayout.X_AXIS));
        fraNumPanel.setPreferredSize(new Dimension(171,256));
        fraNumPanel.setOpaque(false);
        fraNumPanel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.5f)));

        custom.gridx = 0;
        custom.gridy = 0;
        custom.insets = new Insets(0,0,200,30);
        rightPanel.add(fraNumPanel,custom);

        // Increase and Decrease Button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(80, 256));
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(255,248,224));

        GridBagConstraints custom = new GridBagConstraints();

        // Increase & Decrease Icon
        ImageIcon incIcon = new ImageIcon("src/assets/inc.png");
        incIcon = new ImageIcon(incIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        ImageIcon decIcon = new ImageIcon("src/assets/dec.png");
        decIcon = new ImageIcon(decIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        // Numerator Button
        JButton numIncrease = new JButton(incIcon);
        numIncrease.setPreferredSize(new Dimension(34,34));
        numIncrease.setBorder(new LineBorder(Color.BLACK));
        numIncrease.setBackground(new Color(217,217,217));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(10,0,10,0);
        custom.fill = GridBagConstraints.CENTER;
        buttonPanel.add(numIncrease, custom);

        JButton numDecrease = new JButton(decIcon);
        numDecrease.setPreferredSize(new Dimension(34,34));
        numDecrease.setBorder(new LineBorder(Color.BLACK));
        numDecrease.setBackground(new Color(217,217,217));

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(0,0,40,0);
        custom.fill = GridBagConstraints.CENTER;
        buttonPanel.add(numDecrease, custom);

        // Denominator Button
        JButton denIncrease = new JButton(incIcon);
        denIncrease.setPreferredSize(new Dimension(34,34));
        denIncrease.setBorder(new LineBorder(Color.BLACK));
        denIncrease.setBackground(new Color(217,217,217));

        custom.gridy = 2;
        custom.gridx = 0;
        custom.insets = new Insets(10,0,0,0);
        custom.fill = GridBagConstraints.CENTER;
        buttonPanel.add(denIncrease, custom);

        JButton denDecrease = new JButton(decIcon);
        denDecrease.setPreferredSize(new Dimension(34,34));
        denDecrease.setBorder(new LineBorder(Color.BLACK));
        denDecrease.setBackground(new Color(217,217,217));

        custom.gridy = 3;
        custom.gridx = 0;
        custom.insets = new Insets(10,0,0,0);
        custom.fill = GridBagConstraints.CENTER;
        buttonPanel.add(denDecrease, custom);

        fraNumPanel.add(buttonPanel);

        // Fraction Number
        JPanel fractionNum = new JPanel(new GridBagLayout());
        fractionNum.setPreferredSize(new Dimension(128,256));
        fractionNum.setBackground(new Color(255,248,224));

        // Numerator & Denominator Number
        JLabel numerator = new JLabel();
        numerator.setText("0");
        numerator.setPreferredSize(new Dimension(60,82));
        numerator.setFont(new Font("Time New Roman", Font.BOLD, 100));

        custom.gridx = 0;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,20,0);
        fractionNum.add(numerator, custom);

//        JLabel fractionBar = new JLabel("_");
//        fractionBar.setFont(new Font("Time New Roman", Font.BOLD, 120));
//        fractionBar.setBorder(new LineBorder(Color.BLACK));
//        fractionBar.setVerticalTextPosition(JLabel.CENTER);
//        fractionBar.setPreferredSize(new Dimension(65,45));
//        fractionNum.add(fractionBar);

        JLabel denominator = new JLabel();
        denominator.setText("0");
        denominator.setPreferredSize(new Dimension(60,82));
        denominator.setFont(new Font("Time New Roman", Font.BOLD, 100));

        custom.gridx = 0;
        custom.gridy = 1;
        custom.insets = new Insets(20,0,0,0);
        custom.fill = GridBagConstraints.CENTER;
        fractionNum.add(denominator, custom);

        fraNumPanel.add(fractionNum);

        add(rightPanel, BorderLayout.LINE_END);
    }

    public void items(){
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(color);
        bottomPanel.setPreferredSize(new Dimension(0,215));

        JPanel itemContainer = new JPanel();
        itemContainer.setPreferredSize(new Dimension(600,140));
        itemContainer.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.5f)));
        bottomPanel.add(itemContainer);

        add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void fraction(){
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(color);

        JLabel fraction = new JLabel();

        ImageIcon circleIcon = new ImageIcon("src/assets/circle.png");
        circleIcon = new ImageIcon(circleIcon.getImage().
                getScaledInstance(184,184, BufferedImage.SCALE_SMOOTH));

        fraction.setIcon(circleIcon);
        custom.gridx = 0;
        custom.gridy = 0;
        custom.insets = new Insets(0,200,0,0);
        centerPanel.add(fraction, custom);

        add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Menu.getOptionCard().show(Menu.getMenuPanel(), "Fraction & Area Simulation");
        }
    }
}
