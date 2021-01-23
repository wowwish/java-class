 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Vavish Ram
 */

/*
<applet code="App1.class" width=200 height=200></applet>
*/

public class App1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void paint(Graphics g)
	{
		g.drawString("Welcome", 150, 150);
	}

    // TODO overwrite start(), stop() and destroy() methods
}
