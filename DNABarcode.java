import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DNABarcode extends Applet implements ActionListener
{
    Label l1;
    Button b1,b2;
    TextField t1;
    boolean flag = false;
    
    public void init()
    {
        l1 = new Label("Enter the DNA sequence : ");
        b1 = new Button("Start");
        b2 = new Button("Clear");
        t1 = new TextField(50);
    }
    
    public void start()
    {
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            flag = true;
        }
        else
        {
            flag = false;
            t1.setText("");
        }
        repaint();
    }
    
    public void paint(Graphics g)
    {
        if(flag)
        {
            String seq = t1.getText();
            int len = seq.length();
            int x = 50;
            seq = seq.toLowerCase();
            for (int i =0; i < len; i++)
            {
                char base = seq.charAt(i);
                switch(base)
                {
                    case 'a' : g.setColor(Color.BLUE);
                                break;
                    case 't' : g.setColor(Color.YELLOW);
                                break;
                    case 'g' : g.setColor(Color.GREEN);
                                break;
                    case 'c' : g.setColor(Color.RED);
                                break;
                }
                
                g.fillRect(x, 50, 10, 20);
                x += 10;
            }
        }
    }
    
}
