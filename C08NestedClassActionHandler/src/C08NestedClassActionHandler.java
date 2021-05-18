import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * author Acer
 */
public class C08NestedClassActionHandler extends JFrame {

    TextField text = new TextField(20);
    Button b;
    private int numClicks = 0;

    class BtnActionHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            numClicks++;
            text.setText("Button Clicked " + numClicks + " times");
        }

    }

    class WinActionHandler implements WindowListener {

        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
        }

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }

    public C08NestedClassActionHandler() {
        setLayout(new FlowLayout());
        WinActionHandler winActHdl = new WinActionHandler();
        addWindowListener(winActHdl);
        
        b = new Button("Click me");
        BtnActionHandler btnActHdl = new BtnActionHandler();
        b.addActionListener(btnActHdl);

        add(b);
        add(text);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        C08NestedClassActionHandler myWindow = new C08NestedClassActionHandler();
        myWindow.setSize(350, 100);
        myWindow.setVisible(true);
    }

}