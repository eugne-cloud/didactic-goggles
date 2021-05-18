
package c05keyeventandkeylistener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class C05KeyEventandKeyListener extends JFrame implements KeyListener {
    
    C05KeyEventandKeyListener() {
        super();
        
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("You have typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("You have pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You have released: " + e.getKeyChar());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        C05KeyEventandKeyListener myWindow = new C05KeyEventandKeyListener();
        myWindow.setSize(350, 100);
        myWindow.setVisible(true);
    }
}  