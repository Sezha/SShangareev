package ru.job4j.condition;

/**
 * Class Point
 * Distance from point to point
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Point {
    /**
     * Coordinate of x
     */
    private int x;

    /**
     * Coordinate of x
     */
    private int y;

    /**
     * Construction of Point
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method distanceTo
     * Count the distance with math formula
     * @param  point
     */
    public double distanceTo(Point that) {
       /* Point a = this;
        Point b = that;
        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;
        double result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 -y2, 2));
        */

        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y -that.y, 2));
    }

    /**
     * Method main
     * @param args points with coordinates
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b =  new Point(2, 5);

        double result = a.distanceTo(b);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        System.out.println("Distance between point A and point B :" + result);

    }
}
