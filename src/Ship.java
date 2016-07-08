 

//import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship extends Polygon implements KeyListener {
	static int speed = 0;
	boolean space = false;
	boolean upKey = false;
	boolean downKey = false;
	boolean leftKey = false;
	boolean rightKey = false;
	boolean otherKey = false;
	static Point[] ship = { new Point(0, 0), new Point(10, 10),
			new Point(0, 20), new Point(20, 10) };
	static Point[] boost = { new Point(0, 0), new Point(20, 10),
			new Point(0, 20), new Point(-12, 15), new Point(-10, 12),
			new Point(-20, 10), new Point(-10, 8), new Point(-12, 5) };

	static int rot = 0;
	static Point pos = new Point(390, 290);
	// antigravity purpose
	static boolean prevPos = false;
	static int gravity = 0;
	//thrust image
	Polygon thrust = new Polygon(boost, new Point(pos.x -15,pos.y), rot);


	public Ship() {
		super(ship, pos, rot);
	}

	public void reset() {
		// default values
		this.rotation = 0;
		this.position = new Point(390, 290);
		this.thrust = new Polygon(boost, new Point(pos.x -15,pos.y), rot);
	}

	// this method creates array of ships.. this will be the lives
	public static Ship[] lives(int n) {
		// create empty array for ships
		Ship[] output = new Ship[n];
		for (int i = 0; i < n; i++) {
			output[i] = new Ship();
		}
		return output;
	}

	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();
		switch (id) {
		case 32:
			space = true;
			break;
		case 37:
			leftKey = true;
			break;
		case 38:
			upKey = true;
			break;
		case 39:
			rightKey = true;
			break;
		// might use the downKey for something maybe rockets
		case 40:
			downKey = true;
			break;
		default:
			otherKey = true;

		}

	}

	public void keyReleased(KeyEvent e) {
		int id = e.getKeyCode();
		switch (id) {
		case 32:
			space = false;
			break;
		case 37:
			leftKey = false;
			break;
		case 38:
			upKey = false;
			break;
		case 39:
			rightKey = false;
			break;
		case 40:
			downKey = false;
			break;
		default:
			otherKey = false;

		}
	}

	public void keyTyped(KeyEvent e) {

	}

	public void move() {
		// added to track which direction it is going
		double prevPosX = position.x;
		double prevPosY = position.y;
		int speed = 0;
		if (upKey) {
			// speed of the ship changes when space is pressed
			if (space) {
				speed = 5;
			} else {
				speed = 2;
			}
			position = new Point(position.x
					+ (speed * Math.cos(Math.toRadians(rotation))), position.y
					+ (speed * Math.sin(Math.toRadians(rotation))));
			thrust.position = position;
							
			if (position.x > 800 && prevPosX < position.x) {
				position = new Point(-10, position.y);
			} else if (position.x < 0 && prevPosX > position.x) {
				position = new Point(810, position.y);
			}
			if (position.y > 600 && prevPosY < position.y) {
				position = new Point(position.x, -10);
			} else if (position.y < 0 && prevPosY > position.y) {
				position = new Point(position.x, 610);
			}

		}
		/*
		 * if(position.x != prevPos.x){ System.out.println("FALSE"); for(int i =
		 * 5; i > 0; i--){ position = new Point(position.x +
		 * (i*Math.cos(Math.toRadians(rotation))), position.y + (i*
		 * Math.sin(Math.toRadians(rotation)))); } prevPos = position; }
		 */
		if (leftKey) {
			rotation = rotation - 5;
			thrust.rotation = rotation;
		}
		if (rightKey) {
			rotation = rotation + 5;
			thrust.rotation = rotation;
		}

	}

}
