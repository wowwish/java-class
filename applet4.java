import java.applet.Applet;
import java.awt.Graphics;

public class applet4 extends Applet
{
	int i=0;
	String names[] = {"Welcome", "Java-Animation", "Enjoyed", "Good-Bye"};
	public void paint(Graphics g)
	{
		g.drawString(names[i], 100, 100);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {}
		i++;
		if(i<4)
		repaint();
		else
		destroy();
	}
}

/*
<applet code="applet2.class" width=400 height=400>
</applet>
*/

