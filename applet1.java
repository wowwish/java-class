import java.applet.*;
import java.awt.*;

public class applet1 extends Applet
{
	int i=0;
	public void paint(Graphics g)
	{	
		if (i == 0)
			g.setColor(Color.red);
		else if(i == 1)
			g.setColor(Color.yellow);
		else if(i == 2)
			g.setColor(Color.green);
		g.fillOval(100,100,50,50);
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException ex) {}
		i++;
		if(i == 3)
			i = 0;
		repaint();
	}
}

/*
<applet code="applet3.class" width="400" height="400">
</applet>
*/
