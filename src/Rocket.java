import acm.program.*;
import acm.graphics.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Rocket extends GPolygon
{
    private Space mySpace;

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
}