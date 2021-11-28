/*
 * Class for drawing rectangles
 */

package paint;

import java.awt.*;
import java.io.Serializable;

public class Rectangle extends Figure implements Serializable {

    protected int length;
    protected int width;

    //method to get the origin point of the rectangle.

    public Rectangle (int px, int py, Color color)
    {
        super(new Point(px,py),color);
        this.length=0;
        this.width=0;
    }

    //method to get the end point of the rectangle.

    public Rectangle (int w, int l)
    {
        super (new Point(w, l));
        this.width=w;
        this.length=l;
    }

    //method to get the length et width of the rectangle.

    public void setBoundingBox(int widthBB, int heightBB) {
        this.width=widthBB;
        this.length=heightBB;
    }

    //This method is used to aproperly color the rectangle, in case you want to draw a rectangle along a negative x and/or y axis.

    public void draw(Graphics graphics){
    graphics.setColor(color);
        int negPx, negPy;

        if (length<0) {negPx=point.getX()+length;}
        else {negPx=point.getX();}

        if (width<0) {negPy=point.getY()+width;}
        else {negPy=point.getY();}

        graphics.setColor(color);
        graphics.fillRect(negPx, negPy, Math.abs(length), Math.abs(width));
    }

    public int getLength()
    {	return this.length;}
    public int getWidth()
    {	return this.width;}
    public void setLength (int l)
    {	this.length=l;}
    public void setWidth (int w)
    {	this.width=w;}

}
