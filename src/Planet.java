import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

//Allows Space to call on this Class to create planets 
public class Planet extends GOval
{


    public Planet(double x, double y, double size, Color d)
    {
        super(x, y, size, size);

        setColor(d);
        setFillColor(d);
        setFilled(true);
    }
}

