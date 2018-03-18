package ru.job4j.condition;

/**
* Вычисление площади треугольника
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	/**
	* Construction of triangle
	* @param point a, b, c
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}	

	/**
	* Метод вычисления полупериметра по длинам сторон.
	* Формула.
	* (ab + ac + bc) / 2
	* @param ab расстояние между точками a b
	* @param ac расстояние между точками a c
	* @param bc расстояние между точками b c
	* @return Полупериметр.
	*/
	public double period(double ab, double ac, double bc) {

		ab = a.distanceTo(b);
		ac = a.distanceTo(c);
		bc = b.distanceTo(c);

    	return ((ab + ac + bc) / 2);
	}
 
	/**
	* Метод вычисления площади треугольника.
	* @return Впрощадь, если треугольник существует или -1, если треугольника нет.
	*/
	public double area() {
		double rsl = -1;
	    double ab = this.a.distanceTo(this.b);
	    double ac = this.a.distanceTo(this.c);
	    double bc = this.b.distanceTo(this.c);
		//получаем полупериметр для вычисления площади треугольника
	    double p = this.period(ab, ac, bc);

	    if (this.exist(ab, ac, bc)) {
			rsl = (Math.sqrt(p * (p - ab) * (p - ac) * (p - bc)));
	    }
    	return rsl;
	}

	/**
	* Метод проверяет можно ли построить треугольник с такими длинами сторон.
	* 
	* @param ab Длина от точки a b. 
	* @param ac Длина от точки a c.
	* @param bc Длина от точки b c.
	* @return
	*/
	private boolean exist(double ab, double ac, double bc) {
		 if ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab)) {
		 	return true;
		 }

	   	return false;
	}


}