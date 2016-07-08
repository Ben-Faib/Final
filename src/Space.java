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
        
        myRocket = new Rocket(c);
        myRocket.addVertex(getWidth()/2, getHeight()/2);
        myRocket.addVertex(getWidth()/2 + 20, getHeight()/2 - 25);
        myRocket.addVertex(getWidth()/2 + 20, getHeight()/2 + 25);
        myRocket.addVertex(getWidth()/2 - 20, getHeight()/2 - 25);
        myRocket.addVertex(getWidth()/2 - 20 ,getHeight()/2 + 25);
        add(myRocket);

    }

    public Rocket getmyRocket(){
        return myRocket;
    }
    public static void main(String[]args)
    {
        new Space().start();
    }
}

