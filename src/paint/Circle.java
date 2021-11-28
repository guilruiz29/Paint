/*
 * Child class of the Ellipse class allowing to draw circles.
 */


package paint;

import java.awt.Color;
import java.io.Serializable;

public class Circle extends Ellipse implements Serializable {

    public Circle (int px, int py, Color c)
    {
        super (px,py,c);
    }

    //It's exactly the same thing as the Ellipse class but this time x axis is equals to y axis.

    public void setBoundingBox (int heightBB, int widthBB)
    {
        this.AxeX=heightBB/2;
        this.AxeY=heightBB/2;
    }

    public void setAxeX(int radius)
    {
        super.setAxeX (radius);
    }

    public void setAxeY(int radius)
    {
        super.setAxeY (radius);
    }
}

