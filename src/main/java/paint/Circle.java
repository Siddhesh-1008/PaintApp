/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

/**
 *
 * @author Siddhesh
 */
class Circle extends Shape{ 
 float radius;
    Point center;

    Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public void draw() {
        System.out.println("Drawing Circle at (" + center.x + "," + center.y + ")");
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}