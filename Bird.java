public class Bird
{
  public int speed;
  public int enterplacement;
  public int motionvec;
  public enum type{
      DUCK, BONUS, PENGUIN, EAGLE
}

  public Bird(int birdspeed, int birdplacement, enum birdtype)
  {
    speed = birdspeed;
    placement = birdplacement;
    type = birdtype;
    vector = motionvec;
  }

  public void setSpeed(int val)
  {
    speed = val;
  }

  public void setEntryPlacement(int val)
  {
    enterplacement = val;
  }

  public void setMotionVector(int val)
  {
    motionvec = val;
  }

  public void setType(enum val)
  {
    type = val;
  }
}
