import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

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

