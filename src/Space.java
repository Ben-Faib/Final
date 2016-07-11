import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Space extends GraphicsProgram
{
    private static Rocket myRocket;
    private static GLabel myMouse;
    private double myAngle = 90;
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
        myRocket.recenter();
        myRocket.setLocation(getWidth()/2, getHeight()/2);
        addMouseListeners();

    }
    
    public void mouseMoved(MouseEvent e)
    {
        double Y1 = myRocket.getY();
        double X1 = myRocket.getX();
        double Y0 = e.getY();
        double X0 =  e.getX();
        double newAngle = GMath.angle(X0, Y0,X1, Y1);
        myRocket.rotate(newAngle-myAngle);
        myAngle = newAngle;
    }
    public static void main(String[]args)
    {
        new Space().start();
    }
    public Rocket getmyRocket(){
        return myRocket;
    }
}

