import java.awt.*;
import java.awt.event.*;

abstract class Game extends Canvas {
  protected boolean on = true;
  protected int width, height;
  protected Image buffer;
  
	public Game(String name, int inWidth, int inHeight) {
	  width = inWidth;
	  height = inHeight;
	  
	  // Frame can be read as 'window' here.
    Frame frame = new Frame(name);
    frame.add(this);
    frame.setSize(width,height);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.addWindowListener(new WindowAdapter() { 
      public void windowClosing(WindowEvent e) {System.exit(0);} 
    });
    
    buffer = createImage(width, height);
	}
  
  // 'paint' will be called every tenth of a second that the game is on.
	abstract public void paint(Graphics brush);
  
  // 'update' paints to a buffer then to the screen, then waits a tenth of
  // a second before repeating itself, assuming the game is on. This is done
  // to avoid a choppy painting experience if repainted in pieces.
  public void update(Graphics brush) {
    paint(buffer.getGraphics());
		brush.drawImage(buffer,0,0,this);
    if (on) {sleep(10); repaint();}
  }
  
  // 'sleep' is a simple helper function used in 'update'.
  private void sleep(int time) {
    try {Thread.sleep(time);} catch(Exception exc){};
  }

}