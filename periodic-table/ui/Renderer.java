package ui;

import java.awt.*;
import element.*;

public class Renderer {

    private static void drawElement(Graphics g, Element e, int x, int y) {

        //Colors
        switch(e.getCategory()) {
            
            case ALKALI_METALS:
                g.setColor(new Color(108, 59, 1));
                break;

            case ALKALINE_EARTH_METALS:
                g.setColor(new Color(132, 96, 17));
                break;
            
            case TRANSITION_METALS:
                g.setColor(new Color(113, 16, 25));
                break;
            
            case POST_TRANSITION_METALS:
                g.setColor(new Color(0, 54, 102));
                break;

            case METALLOIDS:
                g.setColor(new Color(1, 81, 70));
                break;

            case REACTIVE_NONMETALS:
                g.setColor(new Color(62, 100, 24));
                break;

            case NOBLE_GASES:
                g.setColor(new Color(58, 33, 81));
                break;
            
            case LANTHANOIDS:
                g.setColor(new Color(64, 44, 23));
                break;
            
            case ACTINOIDS:
                g.setColor(new Color(115, 46, 76));
                break;
            
            case UNKNOWN:
                g.setColor(new Color(34, 34, 34));
                break;
        }
        
        //Box Drawing
        g.fillRect(x, y - 15, 80, 80);
        g.setColor(Color.black);
        g.drawRect(x, y - 15, 80, 80);
        g.setColor(Color.black);
        g.drawRect(x, y - 15, 80, 80);

        //Text Drawing
        Font defaultFont = new Font(Font.SANS_SERIF, Font.BOLD, 13);
        Font bigFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        g.setColor(new Color(200, 200, 200));
        g.setFont(defaultFont);
        g.drawString(e.getAtomicNumber() + "", x + 5, y);
        g.setFont(bigFont);
        g.drawString(e.getSymbol(), x + 5, y + 20);
        g.setFont(defaultFont);
        g.drawString(e.getName(), x + 5, y + 40);
        g.drawString(e.getAtomicWeight() + "u", x + 5, y + 60);

    }

    public static void drawElements(Graphics g) {
         
        int x, y;
        for (Element e: ElementManager.elements) {
            x = (e.getGroup() * Frame.BLOCK_SIZE) - Frame.BLOCK_SIZE;
            y = (e.getPeriod() * Frame.BLOCK_SIZE) - 65;
            Renderer.drawElement(g, e, x, y);
        }
    }

    public static void drawGrid(Graphics g) {

        int x, y;
        g.setColor(Color.black);
        for (int group = 0; group <= Frame.GROUP_COUNT; group++) {
            for (int period = 0; period <= Frame.PERIOD_COUNT; period++ ) {
                x = (group * Frame.BLOCK_SIZE) - Frame.BLOCK_SIZE;
                y = (period * Frame.BLOCK_SIZE) - 65;
                g.drawRect(x, y - 15, Frame.BLOCK_SIZE - 1, Frame.BLOCK_SIZE - 1);
            }
        }
    }

}
