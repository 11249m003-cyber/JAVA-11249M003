import java.applet.Applet;
import java.awt.*;
public class GeometricShapes extends Applet {
    public void paint(Graphics g) {

        g.drawRect(50, 50, 100, 60);

        g.drawOval(200, 50, 80, 80);

        g.drawLine(50, 180, 200, 180);

        g.drawLine(300, 180, 350, 100);
        g.drawLine(350, 100, 400, 180);
        g.drawLine(300, 180, 400, 180);
    }
}
