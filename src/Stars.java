import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class Stars extends GPolygon
{ 
    GPolygon gpoly = new GPolygon();
    private double x;
    private double y;
    private Space mySpace;

    public Stars(Color d )
    {
        setColor(Color.WHITE); 
        setFillColor(Color.WHITE);
        setFilled(true);
    }

}