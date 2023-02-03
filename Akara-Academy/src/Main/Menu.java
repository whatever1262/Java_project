package Main;

import javax.swing.*;
import javax.swing.border.Border;
import Primary.*;
import Elementary.*;
import HighSchool.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Menu implements ActionListener {

    private static final JPanel menuPanel = new JPanel();

    // Card Layout
    private static final CardLayout optionCard = new CardLayout();

    // Color and Icon
    Color color = new Color(214, 255, 253);
    Border border = new LineBorder(Color.BLACK);
    ImageIcon mathIcon = new ImageIcon("src/assets/math.png");
    ImageIcon simIcon = new ImageIcon("src/assets/simulation.png");
    ImageIcon gameIcon = new ImageIcon("src/assets/game.png");
    ImageIcon countingIcon = new ImageIcon("src/assets/counting.png");
    ImageIcon comparingIcon = new ImageIcon("src/assets/comparing.png");
    ImageIcon fractionIcon = new ImageIcon("src/assets/fraction.png");
    ImageIcon areaIcon = new ImageIcon("src/assets/area.png");
    ImageIcon backIcon = new ImageIcon("src/assets/back.png");


    /* Education Level Panel */
    private final JPanel educationLevelOptionPanel = new JPanel(new BorderLayout());
    /* Primary School Panel */
    private final JPanel subPrimaryPanel = new JPanel(new BorderLayout());
    private final JPanel simAndGamePrimaryPanel = new JPanel(new BorderLayout());
    private final JPanel simCountingAndComparingPanel = new JPanel(new BorderLayout());
    private final JPanel gameCountingAndComparingPanel = new JPanel(new BorderLayout());
    /* Elementary School Panel */
    private final JPanel subElementaryPanel = new JPanel(new BorderLayout());
    private final JPanel simAndGameElementaryPanel = new JPanel(new BorderLayout());
    private final JPanel simElementaryPanel = new JPanel(new BorderLayout());
    private final JPanel gameElementaryPanel = new JPanel(new BorderLayout());
    /* High School Panel */
    private final JPanel subHighSchoolPanel = new JPanel(new BorderLayout());
    private final JPanel mathHSPanel = new JPanel(new BorderLayout());
    private final JPanel physicHSPanel = new JPanel(new BorderLayout());
    private final JPanel chemHSPanel = new JPanel(new BorderLayout());

    /* Button */
    //region Education Level Button
    private final JButton primaryButton = new JButton("Primary");
    private final JButton elementaryButton = new JButton("Elementary");
    private final JButton highSchoolButton = new JButton("High school");
    //endregion

    //region Simulation and Game Button in primary level
    private final JButton simPrimaryButton = new JButton("Simulation");
    private final JButton gamePrimaryButton = new JButton("Game");
    // Counting and Comparing button in simulation option
    private final JButton countingSimButton = new JButton("Counting");
    private final JButton comparingSimButton = new JButton("Comparing");
    // Counting and Comparing button in game option
    private final JButton countingGameButton = new JButton("Counting");
    private final JButton comparingGameButton = new JButton("Comparing");
    //endregion

    //region Elementary School Button
    private final JButton simElementaryButton = new JButton("Simulation");
    private final JButton gameElementaryButton = new JButton("Game");
    // Fraction and Area button in simulation option
    private final JButton fractionSimButton = new JButton("Fraction");
    private final JButton areaSimButton = new JButton("Area & Perimeter");
    // Fraction and Area button in game option
    private final JButton fractionGameButton = new JButton("Fraction");
    private final JButton areaGameButton = new JButton("Area & Perimeter");
    // Math Button
    private final JButton mathPrimaryButton = new JButton("Mathematics");
    private final JButton mathElementaryButton = new JButton("Mathematics");
    //endregion

    //region High School Button
    private final JButton mathHSButton = new JButton("Mathematics");
    private final JButton physicHSButton = new JButton("Physic");
    private final JButton chemHSButton = new JButton("Chemistry");
    private final JButton lineSimButton = new JButton("Line");
    private final JButton quadraticButton = new JButton("Quadratic");
    private final JButton parabolaButton = new JButton("Parabola");
    private final JButton waveButton = new JButton("Wave");
    private final JButton laboratoryButton = new JButton("Laboratory");
    //endregion

    // Back Button
    private final JButton[] backButton = new JButton[13];

    public Menu(){
        /* Customize Panel */
        menuPanel.setPreferredSize(new Dimension(1460,1024));
        menuPanel.setBackground(color);

        menuPanel.setLayout(optionCard);
        menuPanel.setBorder(border);

        setBackButton();
        educationLevel();
        mathematicsPrimaryOption();
        simulationAndGamePrimaryOption();
        simulationPrimaryLevel();
        gamePrimaryLevel();
        // Elementary School
        mathematicsElementary();
        simulationAndGameElementaryOption();
        simulationElementaryOption();
        gameElementaryOption();

        // High School
        subjectHighSchool();
        mathHighSchool();
        physicHighSchool();
        chemistryHighSchool();
    }
    // Init Back Button
    public void setBackButton(){
        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));
        for(int i = 0; i < 13; i++){
            backButton[i] = new JButton();
            backButton[i].setIcon(backIcon);
            backButton[i].setFocusable(false);
            backButton[i].setContentAreaFilled(false);
            backButton[i].setBorderPainted(false);
            backButton[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            backButton[i].addActionListener(this);
        }
    }

    //region Education Level
    public void educationLevel(){
        // Icons
        educationLevelOptionPanel.setBackground(color);
        JPanel subPanel = new JPanel(new GridBagLayout());
        JPanel topPanel = new JPanel();
        subPanel.setBackground(color);

        topPanel.setPreferredSize(new Dimension(0,60));
        topPanel.setBackground(color);
        educationLevelOptionPanel.add(topPanel, BorderLayout.PAGE_START);

        ImageIcon primaryIcon = new ImageIcon("src/assets/primary.png");
        primaryIcon = new ImageIcon(primaryIcon.getImage().
                getScaledInstance(260,260, BufferedImage.SCALE_SMOOTH));

        ImageIcon elementaryIcon = new ImageIcon("src/assets/elementary.png");
        elementaryIcon = new ImageIcon(elementaryIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        ImageIcon highSchoolIcon = new ImageIcon("src/assets/high.png");
        highSchoolIcon = new ImageIcon(highSchoolIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        primaryButton.setIcon(primaryIcon);
        primaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        primaryButton.setVerticalTextPosition(JButton.BOTTOM);
        primaryButton.setVerticalAlignment(JButton.TOP);
        primaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        primaryButton.setContentAreaFilled(false);
        primaryButton.setFocusable(false);
        primaryButton.setBorderPainted(false);
        primaryButton.setHorizontalTextPosition(JButton.CENTER);
        primaryButton.addActionListener(this);

        elementaryButton.setIcon(elementaryIcon);
        elementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        elementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        elementaryButton.setVerticalAlignment(JButton.TOP);
        elementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        elementaryButton.setContentAreaFilled(false);
        elementaryButton.setFocusable(false);
        elementaryButton.setBorderPainted(false);
        elementaryButton.setHorizontalTextPosition(JButton.CENTER);
        elementaryButton.addActionListener(this);

        highSchoolButton.setIcon(highSchoolIcon);
        highSchoolButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        highSchoolButton.setVerticalTextPosition(JButton.BOTTOM);
        highSchoolButton.setVerticalAlignment(JButton.TOP);
        highSchoolButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        highSchoolButton.setContentAreaFilled(false);
        highSchoolButton.setFocusable(false);
        highSchoolButton.setBorderPainted(false);
        highSchoolButton.setHorizontalTextPosition(JButton.CENTER);
        highSchoolButton.addActionListener(this);
        highSchoolButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Select Your Education Level");
        eduLevel.setPreferredSize(new Dimension(750,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.fill = GridBagConstraints.PAGE_START;
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 3;
        subPanel.add(eduLevel, custom);

        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.gridx = 0;
        custom.gridy = 1;
        custom.gridwidth = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,50);
        subPanel.add(primaryButton, custom);

        custom.fill = GridBagConstraints.CENTER;
        custom.gridy = 1;
        custom.gridx = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        subPanel.add(elementaryButton, custom);

        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        subPanel.add(highSchoolButton, custom);


        educationLevelOptionPanel.add(subPanel, BorderLayout.CENTER);
        menuPanel.add(educationLevelOptionPanel, "eduOption");
    }
    //endregion

    //region Math in Primary School
    public void mathematicsPrimaryOption(){
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        subPrimaryPanel.setBackground(color);

        JPanel mathPanel = new JPanel();
        mathPanel.setBackground(color);
        mathPanel.setLayout(new GridBagLayout());

        mathPrimaryButton.setIcon(mathIcon);
        mathPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathPrimaryButton.setVerticalAlignment(JButton.TOP);
        mathPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathPrimaryButton.setContentAreaFilled(false);
        mathPrimaryButton.setFocusable(false);
        mathPrimaryButton.setBorderPainted(false);
        mathPrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        mathPrimaryButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.PAGE_START;
        mathPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        mathPanel.add(mathPrimaryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));
        backPanel.add(backButton[0]);

        subPrimaryPanel.add(backPanel, BorderLayout.PAGE_START);
        subPrimaryPanel.add(mathPanel, BorderLayout.CENTER);

        menuPanel.add(subPrimaryPanel, "mathPrimaryOption");
    }
    //endregion

    public void simulationAndGamePrimaryOption(){
        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        simPrimaryButton.setIcon(simIcon);
        simPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simPrimaryButton.setVerticalAlignment(JButton.TOP);
        simPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simPrimaryButton.setContentAreaFilled(false);
        simPrimaryButton.setFocusable(false);
        simPrimaryButton.setBorderPainted(false);
        simPrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        simPrimaryButton.addActionListener(this);

        gamePrimaryButton.setIcon(gameIcon);
        gamePrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gamePrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gamePrimaryButton.setVerticalAlignment(JButton.TOP);
        gamePrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gamePrimaryButton.setContentAreaFilled(false);
        gamePrimaryButton.setFocusable(false);
        gamePrimaryButton.setBorderPainted(false);
        gamePrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        gamePrimaryButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(simPrimaryButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(gamePrimaryButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[3]);

        simAndGamePrimaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simAndGamePrimaryPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(simAndGamePrimaryPanel, "Simulation & Game Primary");
    }

    public void simulationPrimaryLevel(){
        simCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        countingSimButton.setIcon(countingIcon);
        countingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        countingSimButton.setVerticalAlignment(JButton.TOP);
        countingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingSimButton.setContentAreaFilled(false);
        countingSimButton.setFocusable(false);
        countingSimButton.setBorderPainted(false);
        countingSimButton.setHorizontalTextPosition(JButton.CENTER);
        countingSimButton.addActionListener(this);

        comparingSimButton.setIcon(comparingIcon);
        comparingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingSimButton.setVerticalAlignment(JButton.TOP);
        comparingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingSimButton.setContentAreaFilled(false);
        comparingSimButton.setFocusable(false);
        comparingSimButton.setBorderPainted(false);
        comparingSimButton.setHorizontalTextPosition(JButton.CENTER);
        comparingSimButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(countingSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(comparingSimButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[8]);

        simCountingAndComparingPanel.add(backPanel, BorderLayout.PAGE_START);
        simCountingAndComparingPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(simCountingAndComparingPanel, "Counting & Comparing Simulation");
    }

    public void gamePrimaryLevel(){

        gameCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        countingGameButton.setIcon(countingIcon);
        countingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        countingGameButton.setVerticalAlignment(JButton.TOP);
        countingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingGameButton.setContentAreaFilled(false);
        countingGameButton.setFocusable(false);
        countingGameButton.setBorderPainted(false);
        countingGameButton.setHorizontalTextPosition(JButton.CENTER);
        countingGameButton.addActionListener(this);

        comparingGameButton.setIcon(comparingIcon);
        comparingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingGameButton.setVerticalAlignment(JButton.TOP);
        comparingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingGameButton.setContentAreaFilled(false);
        comparingGameButton.setFocusable(false);
        comparingGameButton.setBorderPainted(false);
        comparingGameButton.setHorizontalTextPosition(JButton.CENTER);
        comparingGameButton.addActionListener(this);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(countingGameButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(comparingGameButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[9]);

        gameCountingAndComparingPanel.add(backPanel, BorderLayout.PAGE_START);
        gameCountingAndComparingPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(gameCountingAndComparingPanel, "Counting & Comparing Game");
    }

    public void mathematicsElementary(){
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel mathPanel = new JPanel();
        mathPanel.setBackground(color);
        mathPanel.setLayout(new GridBagLayout());

        mathElementaryButton.setIcon(mathIcon);
        mathElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathElementaryButton.setVerticalAlignment(JButton.TOP);
        mathElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathElementaryButton.setContentAreaFilled(false);
        mathElementaryButton.setFocusable(false);
        mathElementaryButton.setBorderPainted(false);
        mathElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        mathElementaryButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        mathPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        mathPanel.add(mathElementaryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backPanel.add(backButton[1]);

        subElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        subElementaryPanel.add(mathPanel, BorderLayout.CENTER);

        menuPanel.add(subElementaryPanel, "mathElementaryOption");
    }

    public void simulationAndGameElementaryOption(){
        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        simElementaryButton.setIcon(simIcon);
        simElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simElementaryButton.setVerticalAlignment(JButton.TOP);
        simElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simElementaryButton.setContentAreaFilled(false);
        simElementaryButton.setFocusable(false);
        simElementaryButton.setBorderPainted(false);
        simElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        simElementaryButton.addActionListener(this);

        gameElementaryButton.setIcon(gameIcon);
        gameElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gameElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gameElementaryButton.setVerticalAlignment(JButton.TOP);
        gameElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gameElementaryButton.setContentAreaFilled(false);
        gameElementaryButton.setFocusable(false);
        gameElementaryButton.setBorderPainted(false);
        gameElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        gameElementaryButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(simElementaryButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(gameElementaryButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[4]);

        simAndGameElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simAndGameElementaryPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(simAndGameElementaryPanel, "Simulation & Game Elementary");
    }

    public void simulationElementaryOption(){
        simElementaryPanel.setBackground(color);
        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        fractionSimButton.setIcon(fractionIcon);
        fractionSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionSimButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionSimButton.setVerticalAlignment(JButton.TOP);
        fractionSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionSimButton.setContentAreaFilled(false);
        fractionSimButton.setFocusable(false);
        fractionSimButton.setBorderPainted(false);
        fractionSimButton.setHorizontalTextPosition(JButton.CENTER);
        fractionSimButton.addActionListener(this);

        areaSimButton.setIcon(areaIcon);
        areaSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaSimButton.setVerticalTextPosition(JButton.BOTTOM);
        areaSimButton.setVerticalAlignment(JButton.TOP);
        areaSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaSimButton.setContentAreaFilled(false);
        areaSimButton.setFocusable(false);
        areaSimButton.setBorderPainted(false);
        areaSimButton.setHorizontalTextPosition(JButton.CENTER);
        areaSimButton.addActionListener(this);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(490,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(fractionSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(areaSimButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[10]);

        simElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simElementaryPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(simElementaryPanel, "Fraction & Area Simulation");
    }

    public void gameElementaryOption(){
        gameElementaryPanel.setBackground(color);

        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        fractionGameButton.setIcon(fractionIcon);
        fractionGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionGameButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionGameButton.setVerticalAlignment(JButton.TOP);
        fractionGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionGameButton.setContentAreaFilled(false);
        fractionGameButton.setFocusable(false);
        fractionGameButton.setBorderPainted(false);
        fractionGameButton.setHorizontalTextPosition(JButton.CENTER);
        fractionGameButton.addActionListener(this);

        areaGameButton.setIcon(areaIcon);
        areaGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaGameButton.setVerticalTextPosition(JButton.BOTTOM);
        areaGameButton.setVerticalAlignment(JButton.TOP);
        areaGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaGameButton.setContentAreaFilled(false);
        areaGameButton.setFocusable(false);
        areaGameButton.setBorderPainted(false);
        areaGameButton.setHorizontalTextPosition(JButton.CENTER);
        areaGameButton.addActionListener(this);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(490,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(fractionGameButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(areaGameButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[11]);

        gameElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        gameElementaryPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(gameElementaryPanel, "Fraction & Area Game");
    }

    public void subjectHighSchool(){
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon physicIcon = new ImageIcon("src/assets/physic.png");
        physicIcon = new ImageIcon(physicIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon chemIcon = new ImageIcon("src/assets/chemistry.png");
        chemIcon = new ImageIcon(chemIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        mathHSButton.addActionListener(this);
        physicHSButton.addActionListener(this);
        chemHSButton.addActionListener(this);

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        mathHSButton.setIcon(mathIcon);
        mathHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathHSButton.setVerticalTextPosition(JButton.BOTTOM);
        mathHSButton.setVerticalAlignment(JButton.TOP);
        mathHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathHSButton.setContentAreaFilled(false);
        mathHSButton.setFocusable(false);
        mathHSButton.setBorderPainted(false);
        mathHSButton.setHorizontalTextPosition(JButton.CENTER);

        physicHSButton.setIcon(physicIcon);
        physicHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        physicHSButton.setVerticalTextPosition(JButton.BOTTOM);
        physicHSButton.setVerticalAlignment(JButton.TOP);
        physicHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        physicHSButton.setContentAreaFilled(false);
        physicHSButton.setFocusable(false);
        physicHSButton.setBorderPainted(false);
        physicHSButton.setHorizontalTextPosition(JButton.CENTER);

        chemHSButton.setIcon(chemIcon);
        chemHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        chemHSButton.setVerticalTextPosition(JButton.BOTTOM);
        chemHSButton.setVerticalAlignment(JButton.TOP);
        chemHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chemHSButton.setContentAreaFilled(false);
        chemHSButton.setFocusable(false);
        chemHSButton.setBorderPainted(false);
        chemHSButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 1;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(mathHSButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(physicHSButton, custom);

        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(chemHSButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.add(backButton[2]);
        backPanel.setBackground(color);

        subHighSchoolPanel.add(backPanel, BorderLayout.PAGE_START);
        subHighSchoolPanel.add(subPanel, BorderLayout.CENTER);
        menuPanel.add(subHighSchoolPanel, "Subject in High School");
    }

    public void mathHighSchool(){
        mathHSPanel.setBackground(color);

        ImageIcon lineIcon = new ImageIcon("src/assets/line.png");
        lineIcon = new ImageIcon(lineIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon quadraticIcon = new ImageIcon("src/assets/quadratic.png");
        quadraticIcon = new ImageIcon(quadraticIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon parabolaIcon = new ImageIcon("src/assets/parabola.png");
        parabolaIcon = new ImageIcon(parabolaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        lineSimButton.addActionListener(this);
        quadraticButton.addActionListener(this);
        parabolaButton.addActionListener(this);

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        lineSimButton.setIcon(lineIcon);
        lineSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        lineSimButton.setVerticalTextPosition(JButton.BOTTOM);
        lineSimButton.setVerticalAlignment(JButton.TOP);
        lineSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lineSimButton.setContentAreaFilled(false);
        lineSimButton.setFocusable(false);
        lineSimButton.setBorderPainted(false);
        lineSimButton.setHorizontalTextPosition(JButton.CENTER);

        quadraticButton.setIcon(quadraticIcon);
        quadraticButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        quadraticButton.setVerticalTextPosition(JButton.BOTTOM);
        quadraticButton.setVerticalAlignment(JButton.TOP);
        quadraticButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quadraticButton.setContentAreaFilled(false);
        quadraticButton.setFocusable(false);
        quadraticButton.setBorderPainted(false);
        quadraticButton.setHorizontalTextPosition(JButton.CENTER);

        parabolaButton.setIcon(parabolaIcon);
        parabolaButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        parabolaButton.setVerticalTextPosition(JButton.BOTTOM);
        parabolaButton.setVerticalAlignment(JButton.TOP);
        parabolaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        parabolaButton.setContentAreaFilled(false);
        parabolaButton.setFocusable(false);
        parabolaButton.setBorderPainted(false);
        parabolaButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 1;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(lineSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(quadraticButton, custom);

        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(parabolaButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.add(backButton[5]);
        backPanel.setBackground(color);

        mathHSPanel.add(backPanel, BorderLayout.PAGE_START);
        mathHSPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(mathHSPanel, "Math in High School");
    }

    public void physicHighSchool(){
        physicHSPanel.setBackground(color);

        ImageIcon waveIcon = new ImageIcon("src/assets/wave.png");
        waveIcon = new ImageIcon(waveIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        waveButton.setIcon(waveIcon);
        waveButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        waveButton.setVerticalTextPosition(JButton.BOTTOM);
        waveButton.setVerticalAlignment(JButton.TOP);
        waveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        waveButton.setContentAreaFilled(false);
        waveButton.setFocusable(false);
        waveButton.setBorderPainted(false);
        waveButton.setHorizontalTextPosition(JButton.CENTER);
        waveButton.addActionListener(this);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(waveButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backPanel.add(backButton[6]);

        physicHSPanel.add(backPanel, BorderLayout.PAGE_START);
        physicHSPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(physicHSPanel, "Physic in High School");
    }

    public void chemistryHighSchool(){
        chemHSPanel.setBackground(color);
        laboratoryButton.addActionListener(this);

        ImageIcon labIcon = new ImageIcon("src/assets/Lab.png");
        labIcon = new ImageIcon(labIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        laboratoryButton.setIcon(labIcon);
        laboratoryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        laboratoryButton.setVerticalTextPosition(JButton.BOTTOM);
        laboratoryButton.setVerticalAlignment(JButton.TOP);
        laboratoryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        laboratoryButton.setContentAreaFilled(false);
        laboratoryButton.setFocusable(false);
        laboratoryButton.setBorderPainted(false);
        laboratoryButton.setHorizontalTextPosition(JButton.CENTER);
        laboratoryButton.addActionListener(this);

        JLabel eduLevel = new JLabel("Chemistry");
        eduLevel.setPreferredSize(new Dimension(0,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(laboratoryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backPanel.add(backButton[7]);

        chemHSPanel.add(backPanel, BorderLayout.PAGE_START);
        chemHSPanel.add(subPanel, BorderLayout.CENTER);

        menuPanel.add(chemHSPanel, "Chemistry in High School");
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // If user clicks on Back Button
        //region Back Button
        if(e.getSource() == backButton[0]){
            optionCard.show(menuPanel, "eduOption");
        }
        if(e.getSource() == backButton[1]){
            optionCard.show(menuPanel, "eduOption");
        }
        if(e.getSource() == backButton[2]){
            optionCard.show(menuPanel, "eduOption");
        }
        if(e.getSource() == backButton[3]){
            optionCard.show(menuPanel, "mathPrimaryOption");
        }
        if(e.getSource() == backButton[4]){
            optionCard.show(menuPanel, "mathElementaryOption");
        }
        if(e.getSource() == backButton[5] || e.getSource() == backButton[6]
            || e.getSource() == backButton[7]){
            optionCard.show(menuPanel, "Subject in High School");
        }
        if(e.getSource() == backButton[8] || e.getSource() == backButton[9]){
            optionCard.show(menuPanel, "Simulation & Game Primary");
        }
        if(e.getSource() == backButton[10] || e.getSource() == backButton[11]){
            optionCard.show(menuPanel, "Simulation & Game Elementary");
        }
        //endregion
        // If user clicks on Primary Level button
        if(e.getSource() == primaryButton){
            optionCard.show(menuPanel, "mathPrimaryOption");
        }
        // If user clicks on math button
        if(e.getSource() == mathPrimaryButton){
            optionCard.show(menuPanel, "Simulation & Game Primary");
        }
        // If user clicks on simulation
        if(e.getSource() == simPrimaryButton){
            optionCard.show(menuPanel, "Counting & Comparing Simulation");
        }
        // If user clicks on game button in primary
        if(e.getSource() == gamePrimaryButton){
            optionCard.show(menuPanel, "Counting & Comparing Game");
        }
        // If user clicks on
        if(e.getSource() == elementaryButton){
            optionCard.show(menuPanel, "mathElementaryOption");
        }
        // If user clicks on math button in elementary option
        if(e.getSource() == mathElementaryButton){
            optionCard.show(menuPanel, "Simulation & Game Elementary");
        }
        // If user clicks on simulation button in elementary option
        if(e.getSource() == simElementaryButton){
            optionCard.show(menuPanel, "Fraction & Area Simulation");
        }
        // If user clicks on game button in elementary option
        if(e.getSource() == gameElementaryButton){
            optionCard.show(menuPanel, "Fraction & Area Game");
        }
        if(e.getSource() == highSchoolButton){
            optionCard.show(menuPanel, "Subject in High School");
        }
        if(e.getSource() == mathHSButton){
            optionCard.show(menuPanel, "Math in High School");
        }
        if(e.getSource() == physicHSButton){
            optionCard.show(menuPanel, "Physic in High School");
        }
        if(e.getSource() == chemHSButton){
            optionCard.show(menuPanel, "Chemistry in High School");
        }
        if(e.getSource() == countingSimButton){
            CountingSim countingSim = new CountingSim();
            menuPanel.add(countingSim, "Primary.CountingSim");
            optionCard.show(menuPanel, "Primary.CountingSim");
        }
        if(e.getSource() == comparingSimButton){
            ComparingSim comparingSim = new ComparingSim();
            menuPanel.add(comparingSim, "Primary.ComparingSim");
            optionCard.show(menuPanel, "Primary.ComparingSim");
        }
        if(e.getSource() == countingGameButton){
            CountingGame countingGame = new CountingGame();
            menuPanel.add(countingGame, "Primary.CountingGame");
            optionCard.show(menuPanel, "Primary.CountingGame");
        }
        if(e.getSource() == comparingGameButton){
            ComparingGame comparingGame = new ComparingGame();
            menuPanel.add(comparingGame, "Primary.ComparingGame");
            optionCard.show(menuPanel, "Primary.ComparingGame");
        }
        if(e.getSource() == fractionSimButton){
            FractionSim fractionSim = new FractionSim();
            menuPanel.add(fractionSim, "Elementary.FractionSim");
            optionCard.show(menuPanel, "Elementary.FractionSim");
        }
        if(e.getSource() == fractionGameButton){
            FractionGame fractionGame = new FractionGame();
            menuPanel.add(fractionGame, "Elementary.FractionGame");
            optionCard.show(menuPanel, "Elementary.FractionGame");
        }
        if(e.getSource() == areaSimButton) {
            AreaSim areaSim = new AreaSim();
            menuPanel.add(areaSim, "Elementary.AreaSim");
            optionCard.show(menuPanel, "Elementary.AreaSim");
        }
        if(e.getSource() == areaGameButton){
            AreaGame areaGame = new AreaGame();
            menuPanel.add(areaGame, "Elementary.AreaGame");
            optionCard.show(menuPanel,"Elementary.AreaGame");
        }
        if(e.getSource() == lineSimButton){
            LineSim lineSim = new LineSim();
            menuPanel.add(lineSim, "LineSim");
            optionCard.show(menuPanel, "LineSim");
        }
        if(e.getSource() == quadraticButton){
            QuadraticSim quadraticSim = new QuadraticSim();
            menuPanel.add(quadraticSim, "QuadraticSim");
            optionCard.show(menuPanel, "QuadraticSim");
        }
        if(e.getSource() == parabolaButton){
            ParabolaSim parabolaSim = new ParabolaSim();
            menuPanel.add(parabolaSim, "ParabolaSim");
            optionCard.show(menuPanel, "ParabolaSim");
        }
        if(e.getSource() == waveButton){
            WaveSim waveSim = new WaveSim();
            menuPanel.add(waveSim, "WaveSim");
            optionCard.show(menuPanel, "WaveSim");
        }
        if(e.getSource() == laboratoryButton){
            LaboratorySim laboratorySim = new LaboratorySim();
            menuPanel.add(laboratorySim, "LaborSim");
            optionCard.show(menuPanel,"LaborSim");
        }
    }

    public static JPanel getMenuPanel(){
        return menuPanel;
    }

    public static CardLayout getOptionCard() {
        return optionCard;
    }
}
