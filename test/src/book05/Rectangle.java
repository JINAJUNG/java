package book05;

public class Rectangle {

	private double width;
	private double hight;
	
	public Rectangle(double width, double hight) {
		this.width=width;
		this.hight=hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getArea() {
		return 	width*hight;
	}

	public double getCircumference() {
		return (width*2)+(hight*2);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.82, 8.65);
		System.out.println("면적 : "+r.getArea());
		System.out.println("둘레 : "+r.getCircumference());
	}

}