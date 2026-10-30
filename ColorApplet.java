
import java.applet.Applet;
import java.awt.*;

public class ColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 80);

        g.setColor(Color.BLUE);
        g.fillOval(230, 50, 120, 80);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 50, 180);
    }
}
