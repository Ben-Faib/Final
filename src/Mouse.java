import acm.program.*;
import acm.graphics.*;
import acm.gui.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;

public class Mouse extends GraphicsProgram
{
    private GLabel myMouse;

    public void init()
    {
        myMouse = new GLabel("");
        myMouse.setLocation(10, 25);

        add(myMouse);
        addMouseListeners();
    }

    public void run()
    {
        while (true)
        {
        }

    }

    public void mouseMoved(MouseEvent e)
    {
        myMouse.setLabel("X:" + e.getX() + " Y:" + e.getY());
    }
    public static void main(String[]args)
    {
        new Mouse().start();
    }
}