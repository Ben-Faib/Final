import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Space extends GraphicsProgram {

    public void init() {


        for (int k = 0; k < 1; k++) {


        }


    }

    public void mouseMoved(MouseEvent e) {
        double y;

        y = e.getY();

        if (y < 0)
            y = 0;

        if (y > getHeight() - 50)
            y = getHeight() - 50;


        double x;

        x = e.getX();

        if (x < 0)
            x = 0;

        if (x > getWidth() - 60)
            x = getWidth() - 60;


    }

    public void run() {
        while (true) {
            for (int k = 0; k < 1; k++) {


            }
        }

    }
}


