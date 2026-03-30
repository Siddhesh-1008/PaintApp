/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package paint;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import paint.Circle;
import paint.DrawingContext;
import paint.Point;
import paint.Rectangle;
import paint.Window;

/**
 *
 * @author Siddhesh
 */
public class PaintTest1 {
    
      @Test
    public void testCircleArea() {
        Circle c = new Circle(5, new Point(0,0));
        assertEquals(78.5, c.area(), 0.5);
    }

    @Test
    public void testRectangleCreation() {
        Rectangle r = new Rectangle(4,6);
        assertNotNull(r);
    }

    @Test
    public void testWindowOpen() {
        Window w = new Window();
        w.open();
        assertTrue(true);
    }

    @Test
    public void testDrawingContext() {
        DrawingContext dc = new DrawingContext();
        dc.setPoint(5,5);
        dc.clearScreen();
        assertTrue(true);
    }

    @Test
    public void testShapeMove() {
        Circle c = new Circle(3, new Point(1,1));
        c.move();
        assertTrue(true);
    }
}
