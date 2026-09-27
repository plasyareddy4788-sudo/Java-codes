import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        // Draw a string at coordinates (50, 50)
        g.drawString("Hello, Applet!", 50, 50); 
    }
}
