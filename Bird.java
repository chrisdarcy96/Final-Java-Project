
//REMOVE http://www.cokeandcode.com/info/tut2d.html

public class Bird
{
  public int speed;
  public int enterplacement;
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

  public void setEntryPlacement(int val)
  {
    enterplacement = val;
  }

  public void setImage (Image i)
  {
    image = i;
  }
}
