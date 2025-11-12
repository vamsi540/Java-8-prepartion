package FactoryPattern;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape is circle");
	}
	public void area() {
		System.out.println("Area of circle is a*a");
	}
	/*
	 * public static void main(String[] args) { Circle c1= new Circle(); c1.draw();
	 * }
	 */
	}

//we can create concrete class means we can create a object,implement the methods that are implemented from abstarct or interface