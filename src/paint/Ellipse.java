/*
* Class for drawing ellipses
*/

package paint;

import java.awt.*;
import java.io.Serializable;

public class Ellipse extends Figure implements Serializable {
    protected int AxeX;
    protected int AxeY;

    public Ellipse(int px, int py, Color c)
    {
        super (new Point(py, px),c);
        this.AxeX=0;
        this.AxeY=0;
    }

    public void draw (Graphics graphics)
    {
        int negPx, negPy;

        if (AxeX<0) {
            negPx=point.getX()+AxeX*2;
        }
        else {
            negPx=point.getX();
        }

        if (AxeY<0) {
            negPy=point.getY()+AxeY*2;
        }
        else {
            negPy=point.getY();
        }

        graphics.setColor(color);
        graphics.fillOval(negPy, negPx, Math.abs(AxeY*2), Math.abs(AxeX*2));
    }


    public void setBoundingBox (int heightBB, int widthBB)
    {
        this.AxeY=widthBB/2;
        this.AxeX=heightBB/2;
    }


    public void setAxeX (int x)
    {
        this.AxeX=x;
    }

    public void setAxeY (int y)
    {
        this.AxeY=y;
    }
}
