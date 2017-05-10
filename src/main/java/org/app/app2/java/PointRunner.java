package org.app.app2.java;

import org.app.app2.scala.Point;

public class PointRunner {
    public static void main(String ... args) {
        System.out.println("Java Runner");
        Point point = new Point(10, 20);
        point.move(5, 10);
        System.out.println(point);
    }
}