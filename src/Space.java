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
        myRocket= new Rocket(getWidth()/2, getHeight()/2, c);

        
    
            myRocket = new Rocket(getWidth() * Math.random(), 
            getHeight() * Math.random(), c);
            add(myRocket);
            myRocket.addVertex(12,11);
        
        
    }
    
}

