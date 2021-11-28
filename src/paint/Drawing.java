/*
*The Drawing contains all the main informations : the picked color and shape, the list of all the drawn figures
*/

package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener, Serializable {

    private int x;
    private int y;
    private String nameFig;
    private Color color;
    private ArrayList<Figure> list;

    public Drawing() {
        super();
        this.setBackground(Color.white);
        this.color = Color.black;
        this.nameFig = "Rectangle";
        this.list = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setNameFig(String nameFig) {
        this.nameFig = nameFig;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Figure formesGeo : list) {
            formesGeo.draw(graphics);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
        switch (nameFig) {
            case "Circle" :
                list.add(new Circle(this.x, this.y, this.color));
                break;
            case "Ellipse" :
                list.add(new Ellipse(this.x, this.y, color));
                break;
            case "Square" :
                list.add(new Square(this.x, this.y, this.color));
                break;
            case "Rectangle" :
                list.add(new Rectangle(this.x, this.y, color));
                break;
            default :
                System.out.println("Figure name not understood : " + nameFig);
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        (list.get(list.size()-1)).setBoundingBox(e.getY()-this.y, e.getX()-this.x);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        (list.get(list.size()-1)).setBoundingBox(e.getY()-this.y, e.getX()-this.x);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    public void reset() {
        this.list.clear();
        paintComponent(this.getGraphics());
    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("sauveDessin.png");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(list.size());
            for (Figure formesGeo : list) {
                oos.writeObject(formesGeo);
            }
            oos.close();
        }
        catch (Exception e) {
            System.out.println("And the backup problems started");
        }
    }

}


