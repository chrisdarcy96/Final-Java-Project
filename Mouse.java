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
  Image backGround;
  public void init(){
    setSize(1400,800);
    backGround = getImage(getCodeBase() , "shooterbackground.png");
    g.drawImage(backGround, 100, 100, 800, 550, this);
    
  }
  public void paint(Graphics g){
      backg.drawImage(backGround, 100, 100, 800, 550, this);
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

