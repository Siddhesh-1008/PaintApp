/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
class DrawingContext {
    public void setPoint(int x, int y) {
        System.out.println("Point set at (" + x + "," + y + ")");
    }

    public void clearScreen() {
        System.out.println("Screen cleared");
    }

    public int getVerticalSize() {
        return 100;
    }

    public int getHorizontalSize() {
        return 200;
    }
}