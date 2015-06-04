public class Bird
{
  public int speed;
  public int placement;
  public enum type{
      DUCK, BONUS, PENGUIN, EAGLE
}

  public Bird(int birdspeed, int birdplacement, enum birdtype)
  {
    speed = birdspeed;
    placement = birdplacement;
    type = birdtype;
  }

  public void setSpeed(int val)
  {
    speed = val;
  }

  public void setPlacement(int val)
  {
    placement = val;
  }
  public void setType(enum val)
  {
    type = val;
  }
}
