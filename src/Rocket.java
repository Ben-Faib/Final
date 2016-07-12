import acm.program.*;
import acm.graphics.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class Rocket extends GPolygon
{ 

    private Space mySpace;

    public Rocket(Color c)
    {
        setColor(c); 
        setFillColor(c);
        setFilled(true);
    }

    public void move()
    {
        if (getX()<=0)
        setLocation(getX() + 300, getY());
}

}
