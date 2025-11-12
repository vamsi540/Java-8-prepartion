package FactoryPattern;

public class FactoryPattern {
	public static void main(String[] args) {
		Shapepattern shapepattern = new Shapepattern();

		Shape s1 = shapepattern.getShape("Circle");
		s1.draw();

		Shape shape2 = shapepattern.getShape("RECTANGLE");
		shape2.draw();

	}

}	
