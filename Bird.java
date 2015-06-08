
//REMOVE http://www.cokeandcode.com/info/tut2d.html

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Bird
{
  public int speed;
  public int placement;
  public Image image;

  public Bird(int birdspeed, int birdplacement, Image im)
  {
    speed = birdspeed;
    placement = birdplacement;
    image = im;

  }

  public void setSpeed(int val)
  {
    speed = val;
  }

  public void setPlacement(int val)
  {
    placement = val;
  }

  public void setImage (Image i)
  {
    image = i;
  }
}
