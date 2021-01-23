import java.applet.Applet;
import java.awt.*;

public class applet3 extends Applet
{
    boolean a = true;
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(500, 200, 300, 300);
        g.setColor(Color.black);
        g.fillOval(565, 275, 60, 60);
        g.fillOval(675, 275, 60, 60);
        if (a)
        {
            g.setColor(Color.pink);
            g.fillArc(575, 360, 150, 100, 180, 180);
            a = false;
        }
        else
        {
            g.setColor(Color.black);
            g.drawArc(575, 360, 150, 100, 0, 180);
            a = true;
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {};
        repaint();
    }
}



/*
<applet code="Smiley_Face.class" width="400" height="400">
</applet>
*/
