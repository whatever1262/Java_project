package Elementary;

import Main.Menu;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class AreaSim extends JPanel implements ActionListener {
    Color color = new Color(214, 255, 253);

    private final JButton backButton = new JButton();

    GridBagConstraints custom = new GridBagConstraints();

    public AreaSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());
        back();
        option();
        gridPaper();
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

    public void option(){
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setPreferredSize(new Dimension(0,200));
        bottomPanel.setBackground(color);

        JPanel elementPanel  = new JPanel();
        elementPanel.setPreferredSize(new Dimension(470,118));
        elementPanel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.5f)));
        bottomPanel.add(elementPanel);


        add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void gridPaper(){
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(color);

        JPanel gridPaperPanel = new JPanel(new BorderLayout());
        gridPaperPanel.setPreferredSize(new Dimension(870,408));
        gridPaperPanel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));


        JLabel gridLabel = new JLabel();
        ImageIcon gridIcon = new ImageIcon("src/assets/grid.jpg");
        gridIcon = new ImageIcon(gridIcon.getImage().getScaledInstance(869,408, BufferedImage.SCALE_SMOOTH));

        gridLabel.setIcon(gridIcon);
        gridPaperPanel.add(gridLabel, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel(new GridBagLayout());
        JLabel areaResult = new JLabel();
        JLabel perimeterResult = new JLabel();

        resultPanel.setPreferredSize(new Dimension(245,120));
        resultPanel.setBorder(new LineBorder(Color.BLACK));
        resultPanel.setBackground(new Color(245,245,245));

        areaResult.setText("Area      : ");
        areaResult.setFont(new Font("Monospaced", Font.BOLD, 23));

        perimeterResult.setText("Perimeter : ");
        perimeterResult.setFont(new Font("Monospaced", Font.BOLD, 23));

        custom.gridy = 0;
        custom.gridx = 0;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,15,0);
        resultPanel.add(areaResult, custom);

        custom.gridy = 1;
        custom.gridx = 0;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,0,0);
        resultPanel.add(perimeterResult, custom);

        custom.gridx = 0;
        custom.gridy = 0;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,35,0);
        centerPanel.add(resultPanel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.fill = GridBagConstraints.CENTER;
        custom.insets = new Insets(0,0,35,0);
        centerPanel.add(gridPaperPanel, custom);

        add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            Menu.getOptionCard().show(Menu.getMenuPanel(), "Fraction & Area Simulation");
        }
    }
}
