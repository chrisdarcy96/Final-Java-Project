import java.applet.*;
import java.awt.*;

public class Graphics extends Applet implements Runnable{
  private Image duck;

  public void init(){
    duck=getImage(getDocumentBase(), "duckspriteactual.png");
    setBackground(Color.white);

  }

  public void run(){

  }

  public void paint(Graphics g){

  }

  public void update(Graphics g){
    paint(g);
  }


}
