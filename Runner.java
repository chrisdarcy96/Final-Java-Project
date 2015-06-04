import java.applet.*;
import java.awt.*;

public class Runner extends Applet{
  //private variables
  private int width;
  private int height;
  private Graphics backg;
  private Image duck=getImage(getDocumentBase(), getParameter("duckspriteactual.png"));
  public void init(){
      width=100;
      height=100;
  }
  public void paint(Graphics g){
      g.drawImage(duck, 100, 100, this);

  }

  private int getBirdX(){return -1;}
  private int getBirdY(){return -1;}
  private void removeDuck(){}

}
