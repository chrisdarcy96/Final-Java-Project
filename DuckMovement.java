import javax.swing.*;
import java.awt.*;


public class DuckMovement {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Train Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new TrainCanvas());
        frame.setVisible(true);
    }

}

class DuckCanvas extends JComponent {

    private int lastX = 0;
    private Image duck = new ImageIcon("duckspriteactual.png").getImage();

    public TrainCanvas() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });

        animationThread.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        int duckW = 269;
        int duckH = 189;
        int duckSpeed = 3;

        int x = lastX + trainSpeed;

        if (x > w + duckW) {
            x = -duckW;
        }

        //gg.setColor(Color.BLACK);
        //gg.fillRect(x, h/2 + trainH, trainW, trainH);
        //Image duck = getImage(getDocumentBase(),"duckspriteactual.png");
        gg.drawImage(duck, x, h/2 + duckH, this);

        lastX = x;
    }

}
