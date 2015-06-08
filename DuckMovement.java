import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.*;


public class DuckMovement{


    public void main(String[] args) {

        BufferedImage myImage;
        try{
          myImage = ImageIO.read(new File("shooterbackground.png"));
        }
        catch(IOException e){
          myImage = null;
          System.out.println(e);
        }

        DuckCanvas dc=new DuckCanvas();
        Clicker click = new Clicker();
        JFrame frame = new JFrame("Duck Hunter");
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.addMouseListener((MouseListener) click );
        frame.add(dc);
        frame.setVisible(true);

    }


}

class Clicker extends JComponent implements MouseListener{
  private int score = 0;



  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mouseClicked(MouseEvent e){
    int duckx = DuckCanvas.getduckX();
    int ducky = DuckCanvas.getduckY();
    int duckh = DuckCanvas.getduckH();
    int duckw = DuckCanvas.getduckW();
    int userx = e.getX();
    int usery = e.getY();

    if(userx>duckx-20 && userx<duckx+duckw+20 && usery>ducky-20 && usery<ducky+duckh+20)
    {
      DuckCanvas.setX(800);
      score++;
      System.out.println(score);
    }
  }
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseMoved(MouseEvent e){}
  public void mouseDragged(MouseEvent e){}
  public int getScore(){return score;}
  public void setScore(int num){score=num;}

}

/*class ImagePanel extends JComponent {
    private Image image;
    public ImagePanel(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}*/


class DuckCanvas extends JComponent{
    private static int duckW = 135;
    private static int duckH = 95;
    private static int duckX = 800;
    private static int duckY = getHeight()/2 - duckH;
    private Image duck = new ImageIcon("duck.png").getImage();
    private int score = 0;


    public DuckCanvas() {
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
    public static void setX(int xval)
    {
      duckX = xval;
    }

    public static int getduckX(){return duckX;}
    public static int getduckY(){return duckY;}
    public static int getduckH(){return duckH;}
    public static int getduckW(){return duckW;}
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        static int h = getHeight();


        int duckSpeed = 3;

        int x = duckX - duckSpeed;

        if (x < 0 - duckW) {
            x = 800;
        }

        gg.drawImage(duck, x, duckY, this);

        duckX = x;
    }

    /*public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
      int duckx = duckX;
      int ducky = duckY;
      int duckh = duckH;
      int duckw = duckW;
      int userx = e.getX();
      int usery = e.getY();

      if(userx>duckx-20 && userx<duckx+duckw+20 && usery>ducky-20 && usery<ducky+duckh+20)
      {
        duckX = 800;
        score++;
        System.out.println(score);
      }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}*/

}
