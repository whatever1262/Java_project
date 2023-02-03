package Primary;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CountingSim extends JPanel implements ActionListener {

    Color color = new Color(214, 255, 253);

    private final JButton backButton = new JButton();

    public CountingSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        items();
        container();
    }

    public void back(){
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
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

        add(leftPanel, BorderLayout.LINE_START);
    }

    public void items(){

        JPanel bottomPanel = new JPanel(new GridBagLayout());
        bottomPanel.setPreferredSize(new Dimension(0,181));
        bottomPanel.setBackground(color);

        GridBagConstraints custom = new GridBagConstraints();

        JPanel itemContainer = new JPanel();
        itemContainer.setPreferredSize(new Dimension(533,123));
        itemContainer.setBackground(new Color(255,242,222));
        itemContainer.setBorder(new LineBorder(Color.BLACK));

        JPanel updateNumPanel = new JPanel();
        updateNumPanel.setPreferredSize(new Dimension(146,133));
        updateNumPanel.setBorder(new LineBorder(Color.gray));
        updateNumPanel.setLayout(new BorderLayout());

        custom.gridx = 0;
        custom.gridy = 0;
        custom.anchor = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,230,0,0);
        bottomPanel.add(itemContainer, custom);

        custom.gridx = 1;
        custom.gridy = 0;
        custom.anchor = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,100,0,0);
        custom.fill = GridBagConstraints.CENTER;
        bottomPanel.add(updateNumPanel, custom);

        //=================================
        // Increase & Decrease Button for update items
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setPreferredSize(new Dimension(58, 133));
        buttonPanel.setBackground(new Color(238,236,236));
        updateNumPanel.add(buttonPanel, BorderLayout.LINE_START);

        // Item Panel
        JPanel itemPanel =  new JPanel(new GridBagLayout());
        itemPanel.setPreferredSize(new Dimension(88, 133));
        itemPanel.setBackground(new Color(238,236,236));
        updateNumPanel.add(itemPanel, BorderLayout.CENTER);

        //=================================
        // Increase and Decrease Button
        ImageIcon incIcon = new ImageIcon("src/assets/inc.png");
        incIcon = new ImageIcon(incIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        ImageIcon decIcon = new ImageIcon("src/assets/dec.png");
        decIcon = new ImageIcon(decIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        JButton incButt = new JButton(incIcon);
        JButton decButt = new JButton(decIcon);

        incButt.setPreferredSize(new Dimension(34,34));
        decButt.setPreferredSize(new Dimension(34,34));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(5,5,5,2);
        buttonPanel.add(incButt, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(0,5,5,2);
        buttonPanel.add(decButt, custom);

        //=================================
        // Item Label
        ImageIcon appleIcon = new ImageIcon("src/assets/apple.png");
        appleIcon = new ImageIcon(appleIcon.getImage().
                getScaledInstance(60,70, BufferedImage.SCALE_SMOOTH));

        JLabel itemLabel = new JLabel();
        itemLabel.setIcon(appleIcon);
        itemPanel.add(itemLabel);

        add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void container(){
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(color);

        JPanel container  = new JPanel();

        container.setPreferredSize(new Dimension(623,567));
        container.setBackground(new Color(245,245,245));
        container.setBorder(new LineBorder(Color.BLACK));

        JPanel numCountPanel = new JPanel();
        numCountPanel.setPreferredSize(new Dimension(170,150));
        numCountPanel.setBorder(new LineBorder(Color.gray));
        numCountPanel.setLayout(new BorderLayout());

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridy = 0;
        custom.gridx = 0;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(30,180,0,0);
        centerPanel.add(container, custom);

        custom.gridy = 0;
        custom.gridx = 1;
        custom.fill = GridBagConstraints.PAGE_START;
        custom.anchor = GridBagConstraints.PAGE_START;
        custom.insets = new Insets(30,100,0,0);
        centerPanel.add(numCountPanel, custom);

        //=================================
        // Button and Number Panel
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setPreferredSize(new Dimension(60,150));
        buttonPanel.setBackground(new Color(255,248,224));
        numCountPanel.add(buttonPanel, BorderLayout.LINE_START);

        JPanel numPanel = new JPanel();
        numPanel.setPreferredSize(new Dimension(110,150));
        numPanel.setBackground(new Color(255,248,224));
        numCountPanel.add(numPanel, BorderLayout.CENTER);

        //===================================
        // Increase and Decrease Button
        ImageIcon incIcon = new ImageIcon("src/assets/inc.png");
        incIcon = new ImageIcon(incIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        ImageIcon decIcon = new ImageIcon("src/assets/dec.png");
        decIcon = new ImageIcon(decIcon.getImage().
                getScaledInstance(16,16,BufferedImage.SCALE_SMOOTH));

        JButton incButt = new JButton(incIcon);
        JButton decButt = new JButton(decIcon);

        incButt.setPreferredSize(new Dimension(34,34));
        decButt.setPreferredSize(new Dimension(34,34));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.insets = new Insets(20,10,10,2);
        buttonPanel.add(incButt, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.insets = new Insets(10,10,15,2);
        buttonPanel.add(decButt, custom);

        //===================================
        JLabel numLabel = new JLabel();
        numLabel.setText("0");
        numLabel.setFont(new Font("Time New Roman", Font.BOLD, 110));
        numPanel.add(numLabel);

        add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Menu.getOptionCard().show(Menu.getMenuPanel(), "Counting & Comparing Simulation");
        }
    }
}
