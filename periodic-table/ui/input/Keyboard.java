package ui.input;

import java.awt.event.*;

public class Keyboard extends KeyAdapter {
    @Override

    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {

            case KeyEvent.VK_Q:
                System.exit(-1);
                break;

        }
    }
}
