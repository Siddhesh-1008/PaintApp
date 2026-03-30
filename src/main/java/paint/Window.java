/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
class Window extends Frame {

    DrawingContext dc = new DrawingContext(); // HAS-A

    public void open() {
        System.out.println("Window opened");
    }

    public void close() {
        System.out.println("Window closed");
    }

    public void move() {
        System.out.println("Window moved");
    }

    public void display() {
        System.out.println("Window displayed");
    }

    public void handleEvent(Event e) {
        System.out.println("Handling event");
    }
}