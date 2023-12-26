interface Set {
    double area();
    double perimeter();
}

class Triangle implements Set {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        return (base * height) / 2;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Circle implements Set {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class InterfaceArea_119{
	public static void main (String[] args){
		Triangle t = new Triangle(10, 20, 30, 40, 50);
		Circle c = new Circle(10);
		System.out.printf("Triangle: Area: %f, Perimeter: %f\n", t.area(), t.perimeter());
		System.out.printf("Circle: Area: %f, Perimeter: %f\n", c.area(), c.perimeter());
	}
}
