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
        myRocket.addVertex(getWidth()/2 + 14, getHeight()/2 - 21);
        myRocket.addVertex(getWidth()/2 + 14, getHeight()/2 + 21);
        myRocket.addVertex(getWidth()/2 - 14, getHeight()/2 - 21);
        myRocket.addVertex(getWidth()/2 - 14 ,getHeight()/2 + 21);

        add(myRocket);

        setBackground(Color.BLACK);

        addMouseListeners();

    }
    
    public void mouseMoved(MouseEvent e)
    {
        double y;

        y = e.getY();

        if (y < 0)
            y = 0;

        if (y > getHeight() - 50)
            y = getHeight() - 50;

        myRocket.setY(y);
        myRocket.setY(y);

        double x;
        x = e.getX();
        if (x<0)
            x = 0;

        if (x> getWidth() - 60)
            x= getWidth() - 60;

        myRocket.setX(x);
        myRocket.setX(x);
    }

    
    
    public Rocket getmyRocket(){
        return myRocket;
    }
}

