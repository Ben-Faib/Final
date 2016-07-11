import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import acm.graphics.GMath;

public class Space extends GraphicsProgram
{
    private Rocket myRocket;
    private GStar myStars;
    private Planet myPlanet;
    private Asteroid myAsteroid;
    private double myAngle = 90;

    public void init()
    {
        Color c = new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random()));
        Color d = new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random()));

        myRocket = new Rocket(c);

        myRocket.addVertex(getWidth()/2, getHeight()/2);
        myRocket.addVertex(getWidth()/2 + 14, getHeight()/2 - 21);
        myRocket.addVertex(getWidth()/2 + 14, getHeight()/2 + 21);
        myRocket.addVertex(getWidth()/2 - 14, getHeight()/2 - 21);
        myRocket.addVertex(getWidth()/2 - 14 ,getHeight()/2 + 21);

        myStars = new GStar(16, 17, 8);
        add(myStars);

        myStars = new GStar(120, 190, 10);
        add(myStars);

        myStars = new GStar(350, 90, 12);
        add(myStars);

        myStars = new GStar(470, 320, 7);
        add(myStars);

        myStars = new GStar(600, 83, 10);
        add(myStars);

        myStars = new GStar(700, 400, 13);
        add(myStars);

        myStars = new GStar(30, 300, 10);
        add(myStars);

        myStars = new GStar(250, 350, 9);
        add(myStars);

        myStars = new GStar(210, 410, 15);
        add(myStars);

        myStars = new GStar(540, 340, 12);
        add(myStars);

        myPlanet = new Planet(450,
            30, 22,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        myPlanet = new Planet(360,
            320, 17,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        myPlanet = new Planet(270,
            240, 14,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        myPlanet = new Planet(650,
            290, 12,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        myPlanet = new Planet(100,
            390, 23,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        myPlanet = new Planet(40,
            100, 27,
            new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random())));
        add(myPlanet);

        add(myRocket);

        myAsteroid = new Asteroid(Color.WHITE, 0, 2);

        myAsteroid.addVertex(getWidth()/2, getHeight()/2 -360);
        myAsteroid.addVertex(getWidth()/2 -24 , getHeight()/2 - 345);
        myAsteroid.addVertex(getWidth()/2 + 36, getHeight()/2 - 345);
        myAsteroid.addArc(100, 90, 10, 40);
        add(myRocket);
        add(myAsteroid);

        setBackground(Color.BLACK);
        myRocket.setLocation(getWidth()/2, getHeight()/2);

        myRocket.recenter();

        addMouseListeners();

        addKeyListeners();
    }


    public void run()
    {
        while (true)
        {
            for (int k = 0 ; k < 1 ; k++)
                myAsteroid.move();

            pause(15);
        }
    }


    public void mouseMoved(MouseEvent e)
    {
        double Y0 = e.getY();
        double X0 = e.getX();
        double Y1 = myRocket.getY();
        double X1 = myRocket.getX();
        double newAngle = GMath.angle(X0, Y0,X1, Y1);
        myRocket.rotate(newAngle - myAngle);
        myAngle = newAngle;
    }

    public void keyPressed(KeyEvent e)
    {
        System.out.println(e.getKeyChar());
        if (e.getKeyChar() == 'w')
        {
            myRocket.move( 0, -35);
        }
        if (e.getKeyChar() == 'd')
        {
            myRocket.move( 35, 0);
        }
        if (e.getKeyChar() == 's')
        {
            myRocket.move( 0, 35);
        }
        if (e.getKeyChar() == 'a')
        {
            myRocket.move( -35, 0);
        }
        if (e.getKeyChar() == 'q')
        {
            myRocket.move( -35, -35);
        }
        if (e.getKeyChar() == 'e')
        {
            myRocket.move( 35, -35);
        }
        if (e.getKeyChar() == 'c')
        {
            myRocket.move( 35, 35);
        }
        if (e.getKeyChar() =='z')
        {
            myRocket.move( -35, 35);
        }
    }

    public static void main(String[]args)
    {
        new Space().start();
    }

    public Rocket getmyRocket()
    {
        return myRocket;
    }
}