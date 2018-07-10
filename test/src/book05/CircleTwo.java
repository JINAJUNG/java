package book05;

public class CircleTwo {
	
	public double radius;
	public static double PI = 3.141592;
	
	public CircleTwo(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}

	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cd.getVolume());
		
		CircleTwo ct = new CircleTwo(2.8);
		System.out.println(ct.getArea()*5.6);
	}

}

class Cylinder{
	 double high;
	 Circle c;
	public Cylinder(Circle c, double h){
		high=h;
		this.c=c;
		getVolume();
	}
	
	public double getVolume() {
		return c.getArea()*high;
	}
}