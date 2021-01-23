// To draw a human face

import java.awt.*;

public class applet2 extends java.applet.Applet {



    public void paint(Graphics g) {
        setBackground(new Color(230,150,180));
        g.setColor(Color.yellow);
        g.fillOval(40,40,120,150);  //Head
        g.setColor(Color.red);
        g.fillOval(57,75,30,20);    // left eye
        g.fillOval(110,75,30,20);   // Right eye
        g.setColor(Color.blue);
        g.fillOval(68,81,10,10);    // pupil (left)
        g.fillOval(121,81,10,10);   // pupil (right)
        g.setColor(Color.red);
        g.fillOval(85,100,30,30);   // Nose
        g.fillArc(60,125,80,40,180,180);  // Mouth
        g.fillOval(25,92,15,30);	     // left ear
        g.fillOval(160,92,15,30);        // right ear
    }
}

