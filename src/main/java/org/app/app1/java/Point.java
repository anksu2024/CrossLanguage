package org.app.app1.java;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
