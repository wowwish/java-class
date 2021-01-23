import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ScrollDemo extends Applet implements AdjustmentListener
{
    Scrollbar red;
    Scrollbar green;
    Scrollbar blue;
    GridLayout g;

    public void init()
    {
        g = new GridLayout(10,1,10,10);
        setLayout(g);          
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,25,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,25,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,25,0,255);
    }

     public void start()
    {
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);   
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        int cr= red.getValue();
        int cg= green.getValue();
        int cb= blue.getValue();
        setBackground(new Color(cr,cg,cb)); 
    }
}

