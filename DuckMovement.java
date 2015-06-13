import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.*;


public class DuckMovement{


    public static void main(String[] args) {

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
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        frame.setLocationRelativeTo(null);
        frame.addMouseListener((MouseListener) click );
        frame.add(dc);
        frame.setVisible(true);

    }


}

class Clicker extends JComponent implements MouseListener, MouseMotionListener{
  private int score = 0;



  public void mouseEntered(MouseEvent e){
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image image = toolkit.getImage("Mouse.png");
    Cursor a = toolkit.createCustomCursor(image, new Point(this.getX(),this.getY()),"");
    this.setCursor(a);
  }
  public void mouseExited(MouseEvent e){}
  public void mouseClicked(MouseEvent e){
    int duckx = DuckCanvas.getduckX();
    int ducky = DuckCanvas.getduckY();
    int duckh = DuckCanvas.getduckH();
    int duckw = DuckCanvas.getduckW();
    int userx = e.getX();
    int usery = e.getY();

    if(userx>duckx-50 && userx<duckx+duckw+50 && usery>ducky-50 && usery<ducky+duckh+50)
    {
      DuckCanvas.setX(800);
      score++;
      if(score == 10){
        DuckCanvas.nextLevel();
        score = 0;
        }
      else{
        DuckCanvas.setScore(score);
        DuckCanvas.updateY();}
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
    private static int duckY = 400 - duckH;
    private Image duck = new ImageIcon("duck.png").getImage();
    private static int score = 0;
    private static int duckSpeed = 3;
    private static int level = 1;
    private static int missed =0;


    public DuckCanvas() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (missed<5) {
                    repaint();
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });

        animationThread.start();
    }
    public static void nextLevel()
    {
      level++;
      duckSpeed+=2;
      score = 0;
      missed = 0;

    }
    public static void setX(int xval)
    {
      duckX = xval;
    }
    public static void setScore(int n)
    {
      score = n;
    }
    public static int updateY()
    {
      int newH = (int)(Math.random()*400);
      if(newH < 95)
         return duckY = newH + 95;
      else if(newH > 305)
         return duckY = newH - 95;
      else
         return duckY = newH;
    }
    public static void GameOver(Graphics g)
    {
      Graphics2D gg = (Graphics2D) g;
      gg.setFont(new Font("Comic Sans MS", Font.PLAIN, 80));
      gg.drawString("GAME OVER",200,100);
    }


    public static int getduckX(){return duckX;}
    public static int getduckY(){return duckY;}
    public static int getduckH(){return duckH;}
    public static int getduckW(){return duckW;}
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();




        int x = duckX - duckSpeed;
        int dir = (int)(Math.random()*15);
        int y = duckY;
        if(dir<5)
          y = duckY - 1;
        else if (dir>10)
          y = duckY + 1;


        if (x < 0 - duckW) {
            x = 800;
            missed++;
            if(missed==5)
              GameOver(gg);
            else
              gg.drawImage(duck, x, updateY(), this);
        }

        gg.drawImage(duck, x, getduckY(), this);
        gg.setColor(Color.WHITE);
        gg.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        gg.drawString("Score: "+score,10,30);
        gg.drawString("Level: "+level,10,60);
        gg.drawString("Missed: "+missed,10,90);

        duckX = x;
        duckY = y;
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
