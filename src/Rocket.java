import acm.program.*;
import acm.graphics.*;
import java.awt.Color;


public class Rocket extends GPolygon
{ 
GPolygon gpoly = new GPolygon();
    private double x;
    private double y;
    private Space mySpace;
    private boolean b = true;

    public Rocket( Color c)
    {
        setColor(c);
        setFillColor(c);
        setFilled (b);
    }

}