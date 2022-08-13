package ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import ui.input.Keyboard;
import ui.input.MenuBar;
import ui.input.Mouse;

import java.awt.*;

public class Frame extends JFrame {
    
    Panel panel;
    public static final int BLOCK_SIZE = 81;

    public static final int PERIOD_COUNT = 9;
    public static final int GROUP_COUNT = 18;

    public static final int WIDTH = BLOCK_SIZE * GROUP_COUNT;
    public static final int HEIGHT = (BLOCK_SIZE * PERIOD_COUNT) + BLOCK_SIZE/2;

    public Frame() {

        panel = new Panel();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(new Keyboard());
        this.addMouseListener(new Mouse());
        this.setJMenuBar(new MenuBar());
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("Periodic Table");
        this.setIconImage(new ImageIcon("resources/icon.png").getImage());
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);

    }

}
