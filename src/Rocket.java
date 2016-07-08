import acm.program.*;
import acm.graphics.*;
import java.awt.Color;


public class Rocket extends GPolygon
{
    private double xPosition;
    private double yPosition;
    private Space mySpace;

    public Rocket(double x, double y, Color c)
    {
        super(x, y);
        
        setColor(c); 
        setFillColor(c);
    }
    
    public Rocket(double x, double y)
    {
        addVertex( 53, 57);
        
        addVertex(54, 59);
        
        addVertex(31, 98);
}

}