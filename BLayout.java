import java.awt.*;
import java.applet.*;

public class BLayout extends Applet
{
    public void init()
    {
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        Button b1 = new Button("NORTH");
        Button b2 = new Button("SOUTH");
        Button b3 = new Button("EAST");
        Button b4 = new Button("WEST");
        Button b5 = new Button("CENTER");
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    }
}
