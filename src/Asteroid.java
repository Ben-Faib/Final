import acm.program.*;
import acm.graphics.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Asteroid extends GPolygon
{
    private double myXVelocity;
    private double myYVelocity;
    private Space mySpace;
   
   public Asteroid(Color s, double XVel, double YVel)
   {
       setColor(Color.WHITE); 
       setFillColor(Color.WHITE);
       
       myXVelocity = XVel;
       myYVelocity = YVel;
}
public void move()
{
    if (getY()<0) {
        
        myYVelocity = 30;
}
}
}
