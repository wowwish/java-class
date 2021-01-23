import java.awt.*;
import java.applet.*;
public class checkboard extends Applet
{
    public void paint(Graphics g)
    {
        int i;
        int j;
        int x,y;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                x =i*80;
                y =j*80;
                if ((i% 2) == (j% 2))
                    g.setColor(Color.red);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 80, 80);
            }
        }
    }
}
/*<applet code="checkerboard.class" width=400 height=400>
</applet>*/


