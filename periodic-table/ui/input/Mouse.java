package ui.input;

import java.awt.event.*;
import element.ElementManager;
import ui.Frame;

public class Mouse implements MouseListener {

    public void mouseClicked(MouseEvent e) {
        int period, group;

        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                System.out.println("(" + e.getX() + "," + e.getY() + ")");

                period = e.getY() / Frame.BLOCK_SIZE;
                group = (e.getX() + Frame.BLOCK_SIZE) / Frame.BLOCK_SIZE;

                System.out.println("Period: "+ period + ", Group: " + group);
                ElementManager.printElementByCoordinates(period, group);
                
            }

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

}
