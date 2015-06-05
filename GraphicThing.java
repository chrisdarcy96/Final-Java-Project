import java.applet.*;
import java.awt.*;
import javax.swing.JApplet;

public class GraphicThing extends JApplet{
  private Image duck;
  private Image backgrd;

  public void init(){
    duck=getImage(getDocumentBase(), "duckspriteactual.png");
    backgrd=getImage(getDocumentBase(), "Duck_Hunt_Lucasta_DA_Wide.png");
    setBackground(Color.cyan);

  }


  public void paint(Graphics g){
    g.drawImage(backgrd, 0, 0, this);
  }

}
