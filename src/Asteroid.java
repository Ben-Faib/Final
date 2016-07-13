import acm.program.*;
import acm.graphics.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Asteroid extends GPolygon
{
    private double myXVelocity;
    private double myYVelocity;
    private Space mySpace;
   // private GLabel myLabel;

    public Asteroid(Color s, double XVel, double YVel, Space space)
    {
        setColor(Color.WHITE); 
        setFillColor(Color.WHITE);

        myXVelocity = XVel;
        myYVelocity = YVel;
       
    }

    public void move()
    {
      

             
        if (getY()> 479) {
            
           myYVelocity = -myYVelocity;
          
        }
        
        if (getX() > 730) { 
            
            myXVelocity = -myXVelocity;
        }
       
        if (getX() <= 20) { 
            
            myXVelocity = -myXVelocity;
        }
        
        if (getY() <= 10) {
            myYVelocity = -myYVelocity;
           
        } 
        
        super.move(myXVelocity, myYVelocity);
    }
}

