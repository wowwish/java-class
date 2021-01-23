import java.applet.*;
import java.awt.Graphics;

public class App extends Applet
{
        @Override
	public void paint(Graphics g)
	{
		g.drawString("Welcome", 150, 150);
	}

}

/*
<applet code="App.class" width="300" height="300">
</applet>
*/
