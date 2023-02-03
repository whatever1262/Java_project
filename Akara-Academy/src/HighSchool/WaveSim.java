package HighSchool;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class WaveSim extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);
    private final JButton backButton = new JButton();

    public WaveSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        option();
        waveContainer();
    }

    public void back(){
        ImageIcon backIcon = new ImageIcon("src/assets/back.png");
        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));

        backButton.setIcon(backIcon);
        backButton.setFocusable(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(this);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(backButton, FlowLayout.LEFT);
        topPanel.setBackground(color);
        add(topPanel, BorderLayout.PAGE_START);
    }

    public void option(){
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rightPanel.setPreferredSize(new Dimension(390,0));
        rightPanel.setBackground(color);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBorder(new LineBorder(Color.black));
        subPanel.setPreferredSize(new Dimension(250, 380));
        subPanel.setBackground(new Color(239,237,237));

        JLabel ampLabel = new JLabel("Amplitude");
        JLabel freqLabel = new JLabel("Frequency");
        ampLabel.setFont(new Font("Monospaced", Font.BOLD, 25));
        freqLabel.setFont(new Font("Monospaced", Font.BOLD, 25));

        JButton showGraph = new JButton("Show Graph");
        showGraph.setPreferredSize(new Dimension(135,30));
        showGraph.setFont(new Font("Monospaced", Font.BOLD, 17));

        JSlider amplitude = new JSlider(0,10,0);
        JSlider frequency = new JSlider(0,10,0);
        amplitude.setPaintTicks(true);
        amplitude.setFont(new Font("Monospaced", Font.PLAIN, 15));
        amplitude.setPaintTrack(true);
        amplitude.setPaintLabels(true);
        amplitude.setMajorTickSpacing(1);
        amplitude.setMinorTickSpacing(1);

        frequency.setPaintTicks(true);
        frequency.setFont(new Font("Monospaced", Font.PLAIN, 15));
        frequency.setPaintTrack(true);
        frequency.setPaintLabels(true);
        frequency.setMajorTickSpacing(1);
        frequency.setMinorTickSpacing(1);

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        subPanel.add(ampLabel,custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.insets = new Insets(10,0,0,0);
        subPanel.add(amplitude, custom);

        custom.gridx = 0;
        custom.gridy = 2;
        custom.insets = new Insets(30,0,0,0);
        subPanel.add(freqLabel, custom);

        custom.gridx = 0;
        custom.gridy = 3;
        custom.insets = new Insets(10,0,0,0);
        subPanel.add(frequency, custom);

        custom.gridx = 0;
        custom.gridy = 4;
        custom.insets = new Insets(30,0,0,0);
        subPanel.add(showGraph, custom);


        rightPanel.add(subPanel);
        add(rightPanel, BorderLayout.LINE_END);
    }

    public void waveContainer(){
        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.setBackground(color);
        add(centerPanel, BorderLayout.CENTER);

        JPanel waveContainer = new JPanel();
        waveContainer.setBorder(new LineBorder(Color.black));
        waveContainer.setPreferredSize(new Dimension(753,800));
        centerPanel.add(waveContainer);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Main.Menu.getOptionCard().show(Menu.getMenuPanel(), "Physic in High School");
        }
    }
}
