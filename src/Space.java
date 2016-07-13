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
    private Asteroid myAsteroid, myAsteroid1,myAsteroid2, myAsteroid3 ,myAsteroid4,myAsteroid5,myAsteroid6;
    private double myAngle = 90;

    public void init()
    {
        Color c = new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random()));
        Color d = new Color((int)(256 * Math.random()), (int)(256 * Math.random()), (int)(256 * Math.random()));

        myRocket = new Rocket(c);

        myRocket.addVertex(getWidth() / 2, getHeight() / 2);
        myRocket.addVertex(getWidth() / 2 + 11, getHeight() / 2 - 18);
        myRocket.addVertex(getWidth() / 2 + 11, getHeight() / 2 + 18);
        myRocket.addVertex(getWidth() / 2 - 11, getHeight() / 2 - 18);
        myRocket.addVertex(getWidth() / 2 - 11, getHeight() / 2 + 18);

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

        myAsteroid = new Asteroid(Color.WHITE, 1, 1.2, this);
        myAsteroid.addVertex(getWidth()/2, getHeight()/2 -360);
        myAsteroid.addVertex(getWidth()/2 -24 , getHeight()/2 - 345);
        myAsteroid.addVertex(getWidth()/2 + 36, getHeight()/2 - 345);
        myAsteroid.addArc(100, 90, 10, 40);
        myAsteroid.recenter();
        myAsteroid.setLocation(21,13);
        add(myAsteroid);

        myAsteroid1 = new Asteroid(Color.WHITE, 1.3, 1.1, this);
        myAsteroid1.addVertex(-20, getHeight()/2 -360);
        myAsteroid1.addVertex(-44, getHeight()/2 - 345);
        myAsteroid1.addVertex(16, getHeight()/2 - 345);
        myAsteroid1.recenter();
        myAsteroid1.setLocation(180, 11);
        add(myAsteroid1);

        myAsteroid2 = new Asteroid(Color.WHITE, 1.4, 1.2, this);
        myAsteroid2.addVertex(getWidth()/2 +30, getHeight()/2 + 180);
        myAsteroid2.addVertex(getWidth()/2 -18, getHeight()/2 + 203);
        myAsteroid2.addVertex(getWidth()/2 + 28, getHeight()/2 + 161);
        myAsteroid2.recenter();
        myAsteroid2.setLocation(300, 100);
        add(myAsteroid2);

        myAsteroid3 = new Asteroid(Color.WHITE, .8 , .8 , this);
        myAsteroid3.addVertex(40, 180);
        myAsteroid3.addVertex(70, 197);
        myAsteroid3.addVertex(30, 197);
        myAsteroid3.addVertex(36, 170);
        myAsteroid3.recenter();
        myAsteroid3.setLocation(400, 100);
        add(myAsteroid3);
        
        myAsteroid4 = new Asteroid(Color.WHITE, .7 , .6 , this);
        myAsteroid4.addVertex(50, 180);
        myAsteroid4.addVertex(30, 170);
        myAsteroid4.addVertex(60, 150);
        myAsteroid4.addVertex(70, 175);
        myAsteroid4.recenter();
        myAsteroid4.setLocation(450, 300);
        add(myAsteroid4);
        
        
        setBackground(Color.BLACK);
        myRocket.setLocation(getWidth() / 2, getHeight() / 2);

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

            myAsteroid.move();
            myAsteroid1.move();
            myAsteroid2.move();
            myAsteroid3.move();
            myAsteroid4.move();

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

    public void gameOver()
    {
        double Ay = myAsteroid.getY();
        double Ax = myAsteroid.getX();
        double Ry = myRocket.getY();
        double Rx = myRocket.getX();
        //while (Ay = Ry && Ax = Rx)
        {
            myAsteroid.sendBackward();
            myRocket.sendBackward();
            System.out.println("Game Over!");
        }
    }
}
