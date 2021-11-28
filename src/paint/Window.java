/*
* This class creates a drawing window where you can choose between different colors and shapes
*/

package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class Window extends JFrame implements ActionListener, Serializable {

        private Drawing draw = new Drawing();
        JFrame frame = new JFrame("Paint");

        public Window() {

            // here we create set up the frame
            frame.setSize(300, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            // here we create set up a menu bar
            JMenuBar menu = new JMenuBar();
            JMenu file = new JMenu("File");
            JMenuItem niou = new JMenuItem("New");
            file.add(niou);
            niou.addActionListener(this);
            JMenuItem open = new JMenuItem("Open");
            file.add(open);
            open.addActionListener(this);
            JMenuItem save = new JMenuItem("Save");
            file.add(save);
            save.addActionListener(this);
            JMenuItem exit = new JMenuItem("Exit");
            file.add(exit);
            exit.addActionListener(this);
            JMenu about = new JMenu("About");
            JMenuItem author = new JMenuItem("Author");
            about.add(author);
            author.addActionListener(this);
            menu.add(file);
            menu.add(about);
            frame.add(menu);
            frame.setJMenuBar(menu);

            // here we create set up the different buttons and their placement
            JPanel mPan = new JPanel();
            mPan.setLayout(new GridLayout(1, 2));
            JPanel colPan = new JPanel();
            colPan.setLayout(new GridLayout(2, 4));
            JPanel formPan = new JPanel();
            formPan.setLayout(new GridLayout(2, 2));

            JButton black = new JButton("Black");
            colPan.add(black);
            black.setBackground(Color.black);
            black.setForeground(Color.white);
            black.addActionListener(this);

            JButton green= new JButton("Green");
            colPan.add(green);
            green.addActionListener(this);
            green.setBackground(Color.green);

            JButton blue = new JButton("Blue");
            colPan.add(blue);
            blue.addActionListener(this);
            blue.setBackground(Color.blue);
            blue.setForeground(Color.white);

            JButton red = new JButton("Red");
            colPan.add(red);
            red.addActionListener(this);
            red.setBackground(Color.red);

            JButton yellow = new JButton("Yellow");
            yellow.addActionListener(this);
            colPan.add(yellow);
            yellow.setBackground(Color.yellow);

            JButton pink = new JButton("Pink");
            colPan.add(pink);
            pink.addActionListener(this);
            pink.setBackground(Color.pink);

            JButton magenta = new JButton("Magenta");
            magenta.addActionListener(this);
            colPan.add(magenta);
            magenta.setBackground(Color.magenta);

            JButton orange = new JButton("Orange");
            orange.addActionListener(this);
            colPan.add(orange);
            orange.setBackground(Color.orange);

            JButton circle = new JButton("Circle");
            circle.addActionListener(this);
            formPan.add(circle);

            JButton ellipse = new JButton("Ellipse");
            ellipse.addActionListener(this);
            formPan.add(ellipse);

            JButton square = new JButton("Square");
            square.addActionListener(this);
            formPan.add(square);

            JButton rectangle = new JButton("Rectangle");
            rectangle.addActionListener(this);
            formPan.add(rectangle);

            mPan.add(colPan, "South");
            mPan.add(formPan, "South");
            frame.add(draw, "Center");
            frame.add(mPan, "South");
        }

        //here we make the buttons functionnal
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New" :
                draw.reset();
                break;
            case "Open" :
                break;
            case "Save" :
                draw.save();
                break;
            case "Exit" :
                System.out.println("Fermeture de la fenêtre");
                frame.dispose();
                break;
            case "Author":
                System.out.println("info");
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog( info, "Author : Guilhem RUIZ",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Black":
                draw.setColor(Color.black);
                System.out.println("Black");
                break;
            case "Green":
                draw.setColor(Color.green);
                System.out.println("Green");
                break;
            case "Blue":
                draw.setColor(Color.blue);
                System.out.println("Blue");
                break;
            case "Red":
                draw.setColor(Color.red);
                System.out.println("Red");
                break;
            case "Yellow":
                draw.setColor(Color.yellow);
                System.out.println("Yellow");
                break;
            case "Pink":
                draw.setColor(Color.pink);
                System.out.println("Pink");
                break;
            case "Magenta":
                draw.setColor(Color.magenta);
                System.out.println("Magenta");
                break;
            case "Orange":
                draw.setColor(Color.orange);
                System.out.println("Orange");
                break;
            case "Ellipse":
                draw.setNameFig("Ellipse");
                System.out.println("Ellipse");
                break;
            case "Circle":
                draw.setNameFig("Circle");
                System.out.println("Circle");
                break;
            case "Rectangle":
                draw.setNameFig("Rectangle");
                System.out.println("Rectangle");
                break;
            case "Square":
                draw.setNameFig("Square");
                System.out.println("Square");
                break;
            default:
                System.out.println("Command not understood : " + command);
                break;
        }
    }
}