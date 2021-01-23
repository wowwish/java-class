import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener
{
    Button d, r, p, close;
    Frame a, b, c;
    Label l1, l2, l3;
    public void init()
    {
        close = new Button("Close");
        a = new Frame("DNA");
        a.setSize(300,300);
        l1 = new Label("DeoxyriboNucelic Acid", Label.CENTER);
        a.add(l1, BorderLayout.CENTER);
        a.setBackground(Color.yellow);
        d = new Button("DNA");
        b = new Frame("RNA");
        b.setSize(300,300);
        l2 = new Label("RiboNucelic Acid", Label.CENTER);
        b.add(l2, BorderLayout.CENTER);
        b.setBackground(Color.orange);
        r = new Button("RNA");
        c = new Frame("Protein");
        c.setSize(300,300);
        l3 = new Label("Protein", Label.CENTER);
        c.add(l3, BorderLayout.CENTER);
        c.setBackground(Color.cyan);
        p = new Button("Protein");
    }
    
   
    
    public void start()
        {
            d.addActionListener(this);
            r.addActionListener(this);
            p.addActionListener(this);
            close.addActionListener(this);
            add(d);
            add(r);
            add(p);
            add(close);
        }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == d)
            a.setVisible(true);
        else if (e.getSource() == r)
            b.setVisible(true);
        else if (e.getSource() == p)
            c.setVisible(true);
        else if (e.getSource() == close)
        {
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
        }
    }
}

