import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class GStar extends GPolygon {
    public GStar(double size) {
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;
        addVertex(-size / 2, -b * size);
        int angle = 0;
        for (int i = 0; i < 5; i++) {
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 72;
        }
        markAsComplete();
    }
    public GStar(double x, double y, double size) {
        this(size);
        setLocation(x, y);
        
        setColor(Color.YELLOW); 
        setFillColor(Color.YELLOW);
        setFilled(true);

    }
} 