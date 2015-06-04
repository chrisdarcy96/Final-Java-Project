public class Gun
{
public enum gun_type{
    AUTO, LASER, CANNON, BLASTER, BUBBLE
}

  public Gun(enum guntype)
  {
    type = guntype;
  }


  public void setgunType(enum val)
  {
    gun_type = val;
  }
}
