
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JApplet;

public class GraphicThing extends JApplet implements MouseListener, MouseMotionListener{
  private Image duck;
  private Image backgrd;

  public void init(){
    duck=getImage(getDocumentBase(), "duckspriteactual.png");
    backgrd=getImage(getDocumentBase(), "shooterbackground.png");
    setBackground(Color.cyan);
    addMouseListener(this);
    addMouseMotionListener(this);
    setVisible(true);

  }


  public void paint(Graphics g){
    g.drawImage(backgrd, 0, 0, this);
    //showStatus("Testing");
    showStatus("Mouse Location: ("+getX()+", "+getY()+")");
  }

  public void setDuck(Bird duck){
    int xLoc=(int)(500.0*Math.random());
    //x-loc is random location between
    //y-location should be set to 60
    duck=new Bird(0, xLoc, duck);
  }

  public void moveDuck(){

  }

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mouseClicked(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseMoved(MouseEvent e) {}
  public void mouseDragged(MouseEvent e){}

}
