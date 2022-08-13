package ui;

import javax.swing.JPanel;

import java.awt.*;

public class Panel extends JPanel  {

    public void paint(Graphics g) {
        super.paint(g);
        Renderer.drawElements(g);
    }

    public Panel() {
        this.setSize(new Dimension(Frame.WIDTH, Frame.HEIGHT));
        this.setBackground(new Color(25, 25, 25));

    }

}
