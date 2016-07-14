import acm.program.*;
import acm.graphics.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Rocket extends GPolygon
{
    private Space mySpace;
    private double myAngle = 90;
    public Rocket(Color c)
    {
        setColor(Color.LIGHT_GRAY);
        setFillColor(c);
        setFilled(true);
    }

    public void move(double dx, double dy)
    {
        super.move(dx, dy);

        if (getX()<=0)
        {
            setLocation(750, getY());
        }
        if (getX()>= 753)
        {
            setLocation(10, getY());
        }
        if (getY()<= 0)
        {
            setLocation(getX(), 445);
        }
        if (getY()>= 450)
        {
            setLocation(this.getX(), 10);
        }
    }

    public void setAngle(double angle)
    {
        myAngle = angle;
    }

    public double getAngle()
    {
        return myAngle;
    }

    public Missile shoot()
    {
        double VXM = 4*Math.cos(myAngle*Math.PI/180);
        double VYM = -4*Math.sin(myAngle*Math.PI/180);
        
        System.out.print(VXM + " " + VYM + " " +myAngle);
        Missile missile = new Missile(getX(), getY(), 6.7, VXM, VYM, Color.WHITE);
        return missile;
        
    }
}