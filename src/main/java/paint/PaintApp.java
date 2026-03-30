/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
public class PaintApp {
      public static void main(String[] args) {

        Window w = new Window();
        w.createFrame();
        w.open();
        w.display();

        Event e = new Event();
        w.handleEvent(e);

        Point p = new Point(10, 20);
        Circle c = new Circle(5, p);
        c.draw();
        System.out.println("Area: " + c.area());

        Rectangle r = new Rectangle(4, 6);
        r.draw();

        Polygon pg = new Polygon();
        pg.draw();

        ConsoleWindow cw = new ConsoleWindow();
        cw.showConsole();

        DialogBox db = new DialogBox();
        db.showDialog();

        w.dc.setPoint(5, 5);
        w.dc.clearScreen();

        w.close();
    }
}

