import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class Missile extends GOval
{
    double myVXM, myVYM;
    public Missile(double x, double y, double size, double VXM, double VYM, Color d)
    {
        super(x, y, size, size);

        setColor(d);
        setFillColor(d);
        setFilled(true);

        myVXM =  VXM;
        myVYM =  VYM;
    }

    public boolean move()
    {

             
        if (getY()> 505 || getX() >780 || getX() <=-15 || getY() <=-15) {

            return false;
        }

        super.move(myVXM, myVYM);
        return true;
    }
}

