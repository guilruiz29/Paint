/*
 * This class is used to create a point (in x and y), to define an origin for each figure.
 */


package paint;

public class Point {
    private int X;
    private int Y;


    public void Point(int a, int b) {
        this.X=a;
        this.Y=b;
    }

    public void Point() {
        this.X=0;
        this.Y=0;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public Point(int x, int y) {
        X = x;
        Y = y;
    }
}


