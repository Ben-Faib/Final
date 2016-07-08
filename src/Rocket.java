
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Rocket extends Applet{
  private final int APPLET_WIDTH = 200;
  private final int APPLET_HEIGHT = 500;

  private int[] xRocket = { 100, 120, 120, 130, 130, 70, 70, 80, 80 };
  private int[] yRocket = { 315, 340, 415, 425, 450, 450, 425, 415, 340 };

  private int[] xWindow = { 95, 105, 110, 90 };
  private int[] yWindow = { 345, 345, 370, 370 };

  private int[] xFlameOrig = { 70, 70, 75, 80, 90, 100, 110, 115, 120, 130,
      130 };
  private int[] xFlame = new int[xFlameOrig.length];
  private int[] yFlame = { 455, 470, 465, 490, 470, 475, 460, 485, 460, 475,
      455 };

  private Timer timer;

  //-----------------------------------------------------------------
  //  Sets up the basic applet environment.
  //-----------------------------------------------------------------
  public void init() {
    setBackground(Color.black);
    setSize(APPLET_WIDTH, APPLET_HEIGHT);

    final int DELAY = 20;
    timer = new Timer(DELAY, new RocketActionListener());
    timer.start();
  }

  //-----------------------------------------------------------------
  //  Draws a rocket using polygons.
  //-----------------------------------------------------------------
  public void paint(Graphics page) {
    page.setColor(Color.cyan);
    page.fillPolygon(xRocket, yRocket, xRocket.length);

    page.setColor(Color.gray);
    page.fillPolygon(xWindow, yWindow, xWindow.length);

    page.setColor(Color.red);
    page.drawPolyline(xFlame, yFlame, xFlame.length);
  }

  private class RocketActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      // Raise the rocket, the window, and the flame.
      for (int i = 0; i < yRocket.length; i++)
        yRocket[i]--;

      for (int i = 0; i < yWindow.length; i++)
        yWindow[i]--;

      for (int i = 0; i < yFlame.length; i++)
        yFlame[i]--;

      // Make small perturbations in the flame, leaving the endpoints
      // alone.
      xFlame[0] = xFlameOrig[0];
      xFlame[xFlame.length - 1] = xFlameOrig[xFlameOrig.length - 1];
      for (int i = 1; i < xFlame.length - 1; i++)
        xFlame[i] = xFlameOrig[i] + ((int) (Math.random() * 6.0)) - 3;

      // And redisplay the whole thing.
      repaint();
    }
  }
}