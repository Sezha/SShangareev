package ru.job4j.paint;
/**
 * class Triangle.
 * @author Sergey Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class Triangle implements Shape {
@Override
    public String draw() {
    StringBuilder pic = new StringBuilder();
    pic.append("*    ");
    pic.append("**   ");
    pic.append("***  ");
    pic.append("**** ");
    pic.append("*****");
    return pic.toString();
}
}
