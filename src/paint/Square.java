/*
 * Child class of the Rectangle class allowing to draw squares.
 */

package paint;

import java.awt.*;
import java.io.Serializable;

public class Square extends Rectangle implements Serializable {
    public Square(int length) {
        super(length, length);
    }

    public Square(int px, int py, Color color) {
        super(px, py, color);
    }

    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setWidth(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.width = heightBB;
        this.length = heightBB;
    }
}
