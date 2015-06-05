import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.*;
import java.net.*;
import java.io.IOException.*;

public class Mouse extends Applet implements MouseListener{
  private Image backGround;
  public void init(){
    //The following is adding the picture to the background of the panel
    //---------------------------------------------------------
    //---------------------------------------------------------
    //It will call the BackGroundPanel class below and that will
    //override the origional white background of the panel
    //the image named Duck_Hunt_Lucasta_DA_Wide.png is temporary while abby
    //finishes the actual background
    this.addMouseListener(this);
    setSize(1400,800);
    backGround = getImage(getCodeBase(), "Duck_Hunt_Lucasta_DA_Wide.png");
    setBackground(Color.cyan);

  }

  public void paint(Graphics g){
    g.drawImage(backGround, 0 ,0, this);
  }
  public void mouseClicked(MouseEvent e){
    //if((e.getX() >= birdx) && (e.getX() <= birdx+75) && (e.getY() >= birdy) && (e.getY <= birdy+60)){
      //update score
      //call levelPassed
      //call removeDuck
    //}
  }
  public void mouseEntered(MouseEvent e){

  }
  public void mouseExited(MouseEvent e){

  }
  public void mouseReleased(MouseEvent e){

  }
  public void mousePressed(MouseEvent e){

  }
}
