/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
class Rectangle extends Shape{
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
