/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
abstract class Shape {
     public abstract void draw();

    public void erase() {
        System.out.println("Erasing shape");
    }

    public void move() {
        System.out.println("Moving shape");
    }

    public void resize() {
        System.out.println("Resizing shape");
    }
}
