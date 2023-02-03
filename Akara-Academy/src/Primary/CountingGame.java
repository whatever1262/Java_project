package Primary;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CountingGame extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);

    private final JButton backButton = new JButton();

    public CountingGame() {
        setPreferredSize(new Dimension(1460, 1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        gameLevel();
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

    public void gameLevel(){
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(color);

        //==============================================
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(0,90));
        titlePanel.setBackground(color);
        centerPanel.add(titlePanel, BorderLayout.PAGE_START);

        JLabel levelTitle = new JLabel();
        levelTitle.setText("LEVEL SELECT");
        levelTitle.setFont(new Font("Monospaced", Font.BOLD, 50));
        titlePanel.add(levelTitle);
        //==============================================
        JPanel levelPanel = new JPanel(new GridBagLayout());
        levelPanel.setBackground(color);
        centerPanel.add(levelPanel, BorderLayout.CENTER);

        JPanel levelContainer = new JPanel(new GridBagLayout());
        levelContainer.setPreferredSize(new Dimension(675,465));
        levelContainer.setBackground(new Color(43,255,242));
        levelContainer.setBorder(new LineBorder(Color.black));
        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.insets = new Insets(0,0,100,0);
        levelPanel.add(levelContainer, custom);
        //==============================================
        ImageIcon lockIcon = new ImageIcon("src/assets/lock.png");
        lockIcon = new ImageIcon(lockIcon.getImage().
                getScaledInstance(32,32, BufferedImage.SCALE_SMOOTH));

        JButton[] levelButton = new JButton[15];

        for(int i = 0; i < 15; i++){
            levelButton[i] = new JButton();
            levelButton[i].setIcon(lockIcon);
            levelButton[i].setPreferredSize(new Dimension(65,80));
            levelButton[i].setBackground(new Color(250,255,0));
            levelButton[i].setBorder(new LineBorder(Color.black));
        }
        //==============================================
        custom.gridx = 0;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,0,50,40);
        levelContainer.add(levelButton[0], custom);

        custom.gridx = 1;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,0,50,40);
        levelContainer.add(levelButton[1], custom);

        custom.gridx = 2;
        custom.gridy = 0;
        custom.insets = new Insets(0,0,50,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        levelContainer.add(levelButton[2], custom);

        custom.gridx = 3;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,40,50,0);
        levelContainer.add(levelButton[3], custom);

        custom.gridx = 4;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,40,50,0);
        levelContainer.add(levelButton[4], custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.insets = new Insets(0,0,0,40);
        custom.fill = GridBagConstraints.HORIZONTAL;
        levelContainer.add(levelButton[5], custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,0,0,40);
        levelContainer.add(levelButton[6], custom);

        custom.gridx = 2;
        custom.gridy = 1;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,0,0,0);
        levelContainer.add(levelButton[7], custom);

        custom.gridx = 3;
        custom.gridy = 1;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,40,0,0);
        levelContainer.add(levelButton[8], custom);

        custom.gridx = 4;
        custom.gridy = 1;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(0,40,0,0);
        levelContainer.add(levelButton[9], custom);

        custom.gridx = 0;
        custom.gridy = 2;
        custom.insets = new Insets(50,0,0,40);
        custom.fill = GridBagConstraints.HORIZONTAL;
        levelContainer.add(levelButton[10], custom);

        custom.gridx = 1;
        custom.gridy = 2;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(50,0,0,40);
        levelContainer.add(levelButton[11], custom);

        custom.gridx = 2;
        custom.gridy = 2;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(50,0,0,0);
        levelContainer.add(levelButton[12], custom);

        custom.gridx = 3;
        custom.gridy = 2;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(50,40,0,0);
        levelContainer.add(levelButton[13], custom);

        custom.gridx = 4;
        custom.gridy = 2;
        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.insets = new Insets(50,40,0,0);
        levelContainer.add(levelButton[14], custom);
        //==============================================
        add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Menu.getOptionCard().show(Menu.getMenuPanel(), "Counting & Comparing Game");
        }
    }
}

