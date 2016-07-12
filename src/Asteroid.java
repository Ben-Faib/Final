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
        if (getY()> 630) {
            if(myYVelocity>0 && myXVelocity == 0) {
            myYVelocity = -myYVelocity -.5;
        }
        else if (myYVelocity > 0 && myXVelocity>0) {
            myYVelocity = -myYVelocity -.5;
            myXVelocity = -myXVelocity -.5;
        }
        else if (myYVelocity > 0 && myXVelocity < 0) {
            myYVelocity = -myYVelocity -.5;
            myXVelocity = -myXVelocity;
        }
    }
    
    if (getY()< -2) { 
        if(myYVelocity<0 && myXVelocity == 0) { 
            myYVelocity = -myYVelocity; 
        }
        else if (myYVelocity < 0 && myXVelocity>0) {
            myYVelocity = -myYVelocity;
            myXVelocity = -myXVelocity -.5;
        }
        else if (myYVelocity < 0 && myXVelocity < 0) {
            myYVelocity = -myYVelocity;
            myXVelocity = -myXVelocity;
        }
    }
    
       if (getX()> 500) {
          myXVelocity = -myXVelocity - .5;
        }
        
       if (getX()< -10) {
           myXVelocity = -myXVelocity + .5;
        }
        super.move(myXVelocity, myYVelocity);
    }
}

