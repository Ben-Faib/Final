import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.MouseEvent;


public class Space extends GraphicsProgram
{
    private Rocket myRocket;

    public void init()
    {
        Color c = new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random()));
        myRocket= new Rocket(50.0, 50.0, c);

        for (int k = 0 ; k <= 1 ; k++)
        {
            myRocket = new Rocket(getWidth() * Math.random(), 
            getHeight() * Math.random(), c);
            
            add(myRocket);
        }

    }
    public void mouseMoved(MouseEvent e)
    {



    }
}

