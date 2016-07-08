import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class Rocket extends GPolygon
{ 
    GPolygon gpoly = new GPolygon();
    private double x;
    private double y;
    private Space mySpace;

    public Rocket(Color c)
    {
        setColor(c); 
        setFillColor(c);
        setFilled(true);
    }

    public void setX (double x) 
    {
        setLocation(x, getY());

    }

    public void setY (double y)
    {
        setLocation(getX(), y);

    }
}