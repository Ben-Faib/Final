import acm.program.*;
import acm.graphics.*;
import java.awt.Color;


public class Rocket extends GPolygon
{ 
GPolygon gpoly = new GPolygon();
    private double x;
    private double y;
    private Space mySpace;

    public Rocket(double x, double y, Color c)
    {
        super(x, y);
        setColor(c); 
        setFillColor(c);
    }
    
    public void addVertex(double x, double y)
    {
    }

}