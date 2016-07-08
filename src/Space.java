import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Space extends GraphicsProgram
{
    private Rocket myRocket;

    public void init()
    {
        myRocket= new Rocket(50.0, 50.0, getFillColor(137));

        for (int k = 0 ; k <= 1 ; k++)
        {
            myRocket = new Rocket(getWidth() * Math.random(), 
            getHeight() * Math.random(), 
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
           
            add(myRocket[k]);

        }

    }
    public void mouseMoved(MouseEvent e)
    {
        double y;

        y = e.getY();

        if (y < 0)
            y = 0;

        if (y > getHeight() - 50)
            y = getHeight() - 50;

       
    
        double x;

        x = e.getX();

        if (x<0)
            x = 0;

        if (x> getWidth() - 60)
            x= getWidth() - 60;

      
    }

    public void run()
    {

    }
}

