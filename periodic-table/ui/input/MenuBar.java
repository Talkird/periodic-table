package ui.input;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class MenuBar extends JMenuBar implements ActionListener {
    
    JMenu settingsMenu;
    JMenu helpMenu;
    JMenuItem darkTheme;
    JMenuItem whiteTheme;

    public MenuBar() {

        settingsMenu = new JMenu("Settings");
        helpMenu = new JMenu("Help");

        this.add(settingsMenu);
        this.add(helpMenu);

        darkTheme = new JMenuItem("Dark Theme");
        whiteTheme = new JMenuItem("White Theme");
        darkTheme.addActionListener(this);
        whiteTheme.addActionListener(this);
        settingsMenu.add(darkTheme);
        settingsMenu.add(whiteTheme);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == darkTheme) {
            System.out.println("Changed theme to dark!");

        } 
        
        if (e.getSource() == whiteTheme) {
            System.out.println("Changed theme to white!");
            
        }
    }
}
