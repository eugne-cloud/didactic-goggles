package c02actioneventandactionlistener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class C02ActionEventandActionListener extends JFrame implements ActionListener  {
        private int counter = 0;
    private JButton b;

    public C02ActionEventandActionListener() {
        super();
        setLayout(new FlowLayout());
        b = new JButton("Click me");
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        C02ActionEventandActionListener myWindow = new C02ActionEventandActionListener();
        myWindow.setSize(350, 100);
        myWindow.setVisible(true);
    }
}



