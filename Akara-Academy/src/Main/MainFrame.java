package Main;

import javax.swing.*;

public class MainFrame {

    private final JFrame mainFrame = new JFrame();

    public MainFrame(){
        init();
    }
    private void init(){

        Menu menu = new Menu();
        mainFrame.add(Menu.getMenuPanel());

        mainFrame.pack();
        mainFrame.setTitle("Akara Academy");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        MainFrame main = new MainFrame();
    }
}
