import java.applet.*;
import java.awt.*;

public class Graphics extends Applet implements Runnable{
  private Image duck;
  private Image backgrd;

  public void init(){
    duck=getImage(getDocumentBase(), "duckspriteactual.png");
    backgrd=getImage(getDocumentBase(). "Duck_Hunt_Lucasta_DA_Wide.png");
    setBackground(Color.

  }

  public void run(){

  }

  public void paint(Graphics g){

  }

  public void update(Graphics g){
    paint(g);
  }


}
