import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JFrame {

    public ChessBoard() {
        setTitle("Chess Board");
        setSize(660, 660);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int x, y, width, height;
        x = 10;
        y = 10;
        width = 75;
        height = 75;
        int borderSize = 10;

        g.setColor(Color.DARK_GRAY);
        g.fillRect(x - borderSize, y - borderSize, (width * 8) + (borderSize * 2), (height * 8) + (borderSize * 2));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.WHITE);
                }
                else {
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x + (j * width), y + (i* height), width, height);
            }
        }
    }
}
