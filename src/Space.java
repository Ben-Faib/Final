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
        
        myRocket= new Rocket(c);
        
            myRocket = new Rocket(c);
            myRocket.addVertex(200,200);
            myRocket.addVertex(225,235);
            myRocket.addVertex(270, 250);
            myRocket.addVertex(490,260);
            add(myRocket);
           
        
        
    }
    
    public Rocket getmyRocket(){
        return myRocket;
    }
}

