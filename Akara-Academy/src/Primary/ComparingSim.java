package Primary;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ComparingSim extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);

    JButton backButton = new JButton();
    GridBagConstraints custom = new GridBagConstraints();

    public ComparingSim() {
        setPreferredSize(new Dimension(1460, 1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        items();
        container();
    }

    public void back(){
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBackground(color);

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
        leftPanel.add(backButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(color);
        rightPanel.setPreferredSize(new Dimension(60,60));

        add(leftPanel, BorderLayout.LINE_START);
        add(rightPanel, BorderLayout.LINE_END);
    }

    public void items(){
        JPanel bottomPanel = new JPanel(new GridBagLayout());
        bottomPanel.setPreferredSize(new Dimension(0,180));
        bottomPanel.setBackground(color);

        //========================================

        JPanel itemContainer = new JPanel();
        itemContainer.setPreferredSize(new Dimension(533,123));
        itemContainer.setBackground(new Color(255,242,222));
        itemContainer.setBorder(new LineBorder(Color.black));
        bottomPanel.add(itemContainer);

        //=========================================
        //region Update item 1
        // Update Number
        JPanel updateNumPanel_1 = new JPanel();
        updateNumPanel_1.setPreferredSize(new Dimension(146,133));
        updateNumPanel_1.setBorder(new LineBorder(Color.gray));
        updateNumPanel_1.setLayout(new BorderLayout());

        JPanel updateNumPanel_2 = new JPanel();
        updateNumPanel_2.setPreferredSize(new Dimension(146,133));
        updateNumPanel_2.setBorder(new LineBorder(Color.gray));
        updateNumPanel_2.setLayout(new BorderLayout());

        custom.gridx = 0;
        custom.gridy = 0;
        custom.anchor = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,0,160);
        bottomPanel.add(updateNumPanel_1, custom);

        custom.gridx = 1;
        custom.gridy = 0;
        custom.anchor = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,0,0);
        bottomPanel.add(itemContainer, custom);

        custom.gridx = 2;
        custom.gridy = 0;
        custom.anchor = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,160,0,0);
        custom.fill = GridBagConstraints.CENTER;
        bottomPanel.add(updateNumPanel_2, custom);

        //=================================
        // Increase & Decrease Button for update items
        JPanel buttonPanel_1 = new JPanel(new GridBagLayout());
        buttonPanel_1.setPreferredSize(new Dimension(58, 133));
        buttonPanel_1.setBackground(new Color(238,236,236));
        updateNumPanel_1.add(buttonPanel_1, BorderLayout.LINE_START);

        JPanel buttonPanel_2 = new JPanel(new GridBagLayout());
        buttonPanel_2.setPreferredSize(new Dimension(58, 133));
        buttonPanel_2.setBackground(new Color(238,236,236));
        updateNumPanel_2.add(buttonPanel_2, BorderLayout.LINE_START);

        // Item Panel
        JPanel itemPanel_1 =  new JPanel(new GridBagLayout());
        itemPanel_1.setPreferredSize(new Dimension(88, 133));
        itemPanel_1.setBackground(new Color(238,236,236));
        updateNumPanel_1.add(itemPanel_1, BorderLayout.CENTER);

        JPanel itemPanel_2 =  new JPanel(new GridBagLayout());
        itemPanel_2.setPreferredSize(new Dimension(88, 133));
        itemPanel_2.setBackground(new Color(238,236,236));
        updateNumPanel_2.add(itemPanel_2, BorderLayout.CENTER);

        //=================================
        // Increase and Decrease Button
        ImageIcon incIcon = new ImageIcon("src/assets/inc.png");
        incIcon = new ImageIcon(incIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        ImageIcon decIcon = new ImageIcon("src/assets/dec.png");
        decIcon = new ImageIcon(decIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        JButton incButt_1 = new JButton(incIcon);
        JButton decButt_1 = new JButton(decIcon);

        JButton incButt_2 = new JButton(incIcon);
        JButton decButt_2 = new JButton(decIcon);

        incButt_1.setPreferredSize(new Dimension(34,34));
        incButt_1.setBackground(new Color(217,217,217));
        decButt_1.setPreferredSize(new Dimension(34,34));
        decButt_1.setBackground(new Color(217,217,217));

        incButt_2.setPreferredSize(new Dimension(34,34));
        incButt_2.setBackground(new Color(217,217,217));
        decButt_2.setPreferredSize(new Dimension(34,34));
        decButt_2.setBackground(new Color(217,217,217));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(5,5,5,2);
        buttonPanel_1.add(incButt_1, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(0,5,5,2);
        buttonPanel_1.add(decButt_1, custom);

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(5,5,5,2);
        buttonPanel_2.add(incButt_2, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(0,5,5,2);
        buttonPanel_2.add(decButt_2, custom);

        //=================================
        // Item Label
        ImageIcon appleIcon = new ImageIcon("src/assets/apple.png");
        appleIcon = new ImageIcon(appleIcon.getImage().
                getScaledInstance(60,70, BufferedImage.SCALE_SMOOTH));

        ImageIcon dogIcon = new ImageIcon("src/assets/dog.png");
        dogIcon = new ImageIcon(dogIcon.getImage().
                getScaledInstance(60,70, BufferedImage.SCALE_SMOOTH));

        JLabel itemLabel_1 = new JLabel();
        itemLabel_1.setIcon(appleIcon);
        itemPanel_1.add(itemLabel_1);

        JLabel itemLabel_2 = new JLabel();
        itemLabel_2.setIcon(dogIcon);
        itemPanel_2.add(itemLabel_2);
        //endregion
        //==========================================

        add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void container(){
        JPanel centerPanel = new JPanel(new BorderLayout());

        JPanel containerPanel = new JPanel(new GridBagLayout());
        containerPanel.setBackground(color);
        centerPanel.add(containerPanel, BorderLayout.CENTER);

        JPanel container_1 = new JPanel();
        container_1.setPreferredSize(new Dimension(486,567));
        container_1.setBackground(new Color(255,242,222));
        container_1.setBorder(new LineBorder(Color.black));

        custom.gridx = 0;
        custom.gridy = 0;
        custom.insets = new Insets(0,0,0,40);
        containerPanel.add(container_1, custom);

        JPanel container_2 = new JPanel();
        container_2.setPreferredSize(new Dimension(486,567));
        container_2.setBackground(new Color(255,242,222));
        container_2.setBorder(new LineBorder(Color.black));

        custom.gridx = 1;
        custom.gridy = 0;
        custom.insets = new Insets(0,40,0,0);
        containerPanel.add(container_2, custom);

        JPanel topPanel = new JPanel(new GridBagLayout());
        topPanel.setPreferredSize(new Dimension(0,170));
        topPanel.setBackground(color);

        //======================================
        //region Number Panel 1
        JPanel numCountPanel_1 = new JPanel();
        numCountPanel_1.setPreferredSize(new Dimension(170,150));
        numCountPanel_1.setBorder(new LineBorder(Color.gray));
        numCountPanel_1.setLayout(new BorderLayout());

        custom.insets = new Insets(0,0,0,52);
        custom.gridy = 0;
        custom.gridx = 0;
        topPanel.add(numCountPanel_1, custom);

        // Button and Number Panel
        JPanel buttonPanel_1 = new JPanel(new GridBagLayout());
        buttonPanel_1.setPreferredSize(new Dimension(60,150));
        buttonPanel_1.setBackground(new Color(255,248,224));
        numCountPanel_1.add(buttonPanel_1, BorderLayout.LINE_START);

        JPanel numPanel_1 = new JPanel();
        numPanel_1.setPreferredSize(new Dimension(110,150));
        numPanel_1.setBackground(new Color(255,248,224));
        numCountPanel_1.add(numPanel_1, BorderLayout.CENTER);

        //===================================
        // Increase and Decrease Button
        ImageIcon incIcon = new ImageIcon("src/assets/inc.png");
        incIcon = new ImageIcon(incIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        ImageIcon decIcon = new ImageIcon("src/assets/dec.png");
        decIcon = new ImageIcon(decIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        JButton incButt_1 = new JButton(incIcon);
        JButton decButt_1 = new JButton(decIcon);

        incButt_1.setPreferredSize(new Dimension(34,34));
        incButt_1.setBackground(new Color(217,217,217));
        decButt_1.setPreferredSize(new Dimension(34,34));
        decButt_1.setBackground(new Color(217,217,217));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(20,10,10,2);
        buttonPanel_1.add(incButt_1, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(10,10,15,2);
        buttonPanel_1.add(decButt_1, custom);

        //===================================
        JLabel numLabel_1 = new JLabel();
        numLabel_1.setText("0");
        numLabel_1.setFont(new Font("Time New Roman", Font.BOLD, 110));
        numPanel_1.add(numLabel_1);
        //endregion
        //======================================

        JLabel operationLabel = new JLabel("=");
        operationLabel.setFont(new Font("Time New Roman", Font.BOLD, 120));

        custom.insets = new Insets(0,0,0,0);
        custom.gridy = 0;
        custom.gridx = 1;
        topPanel.add(operationLabel, custom);

        //======================================
        //region Number Panel 1
        JPanel numCountPanel_2 = new JPanel();
        numCountPanel_2.setPreferredSize(new Dimension(170,150));
        numCountPanel_2.setBorder(new LineBorder(Color.gray));
        numCountPanel_2.setLayout(new BorderLayout());

        custom.insets = new Insets(0,52,0,0);
        custom.gridy = 0;
        custom.gridx = 2;
        topPanel.add(numCountPanel_2, custom);

        // Button and Number Panel
        JPanel buttonPanel_2 = new JPanel(new GridBagLayout());
        buttonPanel_2.setPreferredSize(new Dimension(60,150));
        buttonPanel_2.setBackground(new Color(255,248,224));
        numCountPanel_2.add(buttonPanel_2, BorderLayout.LINE_START);

        JPanel numPanel_2 = new JPanel();
        numPanel_2.setPreferredSize(new Dimension(110,150));
        numPanel_2.setBackground(new Color(255,248,224));
        numCountPanel_2.add(numPanel_2, BorderLayout.CENTER);

        //===================================
        // Increase and Decrease Button
        JButton incButt_2 = new JButton(incIcon);
        JButton decButt_2 = new JButton(decIcon);

        incButt_2.setPreferredSize(new Dimension(34,34));
        incButt_2.setBackground(new Color(217,217,217));
        decButt_2.setPreferredSize(new Dimension(34,34));
        decButt_2.setBackground(new Color(217,217,217));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(20,10,10,2);
        buttonPanel_2.add(incButt_2, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(10,10,15,2);
        buttonPanel_2.add(decButt_2, custom);

        //===================================
        JLabel numLabel_2 = new JLabel();
        numLabel_2.setText("0");
        numLabel_2.setFont(new Font("Time New Roman", Font.BOLD, 110));
        numPanel_2.add(numLabel_2);
        //endregion
        //======================================

        centerPanel.add(topPanel, BorderLayout.PAGE_START);
        add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Menu.getOptionCard().show(Menu.getMenuPanel(), "Counting & Comparing Simulation");
        }
    }
}
