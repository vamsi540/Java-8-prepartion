package FactoryPattern;

public class Shapepattern extends FactoryPattern {
	public Shape getShape(String Shapetype) {
		if (Shapetype == null) {
			return null;
		}
		if (Shapetype.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if (Shapetype.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}

		return null;
	}
}
