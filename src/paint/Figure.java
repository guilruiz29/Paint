/*
 * This abstract class associates an origin and a color. It is the mother class of all figures.
 */

package paint;

import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {

    protected Color color;
    protected Point point;

    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics graphics);

    public Figure (Point p) {
        this.point=p;
    }

    public Figure (Point p, Color c) {
        this.point=p;
        this.color=c;
    }

    public Color getColor() {
        return color;
    }

    public Point getPoint() {
        return point;
    }
//
    public Figure(Color color, Point point) {
        this.color = color;
        this.point = point;
    }
}
