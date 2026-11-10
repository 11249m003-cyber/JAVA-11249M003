import java.applet.Applet;
import java.awt.*;
public class HumanFace extends Applet {
    public void paint(Graphics g) {

        // Face
        g.drawOval(100, 50, 200, 220);

        // Eyes
        g.fillOval(145, 120, 20, 20);
        g.fillOval(235, 120, 20, 20);

        // Nose
        g.drawLine(200, 140, 180, 190);
        g.drawLine(180, 190, 210, 190);

        // Mouth
        g.drawArc(155, 190, 100, 40, 180, 180);
    }
}
