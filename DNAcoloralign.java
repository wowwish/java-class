import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class DNAcoloralign extends Applet implements ActionListener
{
    Panel p;
    GridLayout gl;
    Label l1,l2;
    Button b1,b2;
    TextField t1,t2, t3;
    boolean flag = false;
 
    public void init()
    {
        l1 = new Label("Enter DNA sequence 1 : ");
        l2 = new Label("Enter DNA sequence 2 : ");
        t1 = new TextField(50);
        t2 = new TextField(50);
        t3 = new TextField(50);
        b1 = new Button("Submit");
        b2 = new Button("Clear");
        gl = new GridLayout(4,1);
        p = new Panel();
    }
    
    public void start()
    {
        p.setLayout(gl);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        add(p);
        add(b1);
        add(b2);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            flag = true;
        }
        else if (e.getSource() == b2)
        {
            flag = false;
            t1.setText("");
            t2.setText("");
        }
        repaint();
    }
    
    public void paint(Graphics g)
    {
        if (flag)
        {
            int x = 50, count = 0;
            String seq1 = t1.getText().toLowerCase();
            String seq2 = t2.getText().toLowerCase();
            int len = seq1.length() > seq2.length() ? seq2.length() : seq1.length();
            for (int i = 0; i < len; i++)
            {
                char base1 = seq1.charAt(i);
                char base2 = seq2.charAt(i);
                if (base1 == base2)
                {   
                    count ++;
                    g.setColor(Color.BLACK);
                    g.drawString(Character.toString(base1).toUpperCase(), x, 400);
                    g.setColor(Color.GREEN);
                }
                else
                {
                    g.setColor(Color.BLACK);
                    g.drawString("*", x, 400);
                }
                g.drawString(Character.toString(base1).toUpperCase(), x, 300);
                g.drawString(Character.toString(base2).toUpperCase(), x, 350);
                t3.setText("Matching Percentage : " + (float)count*100/len);
                
                x = x + 10;
            }
        }
    }
}
