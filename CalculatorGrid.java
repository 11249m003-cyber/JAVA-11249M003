import java.awt.*;
import javax.swing.*;

public class CalculatorGrid {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        f.setLayout(new BorderLayout());

        JTextField display = new JTextField();
        display.setEditable(false);
        f.add(display, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            p.add(btn);
        }

        f.add(p, BorderLayout.CENTER);

        f.setSize(300, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
