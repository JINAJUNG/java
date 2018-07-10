package book05;

public class Circle {

	public double radius;
	public static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius=radius;
		//getArea();
	}
	
	public double getArea() {
		return radius*radius*PI;
	}

	
	public class Cylinder{
	
		public double high;
		
		public Cylinder(Circle c, double h){
			high=h;
			radius = c.radius;
			getVolume();
		}
		
		public double getVolume() {
			return getArea()*high;
		}
	}

	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Circle.Cylinder cd = c.new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cd.getVolume());
	}

}

