package book06;

public class Complex {
	//http://gall.dcinside.com/board/view/?id=programming&no=42271
	// http://mwultong.blogspot.com/2007/02/java-complex-number-class.html
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

//	public Complex add(Complex c) {
//
//		return new Complex(real + c.real, imaginary + c.imaginary); // 이름 없는 객체
//
//	}

	public static Complex add(Complex c1, Complex c2) {
		return new Complex(c1.real+c2.real,c1.imaginary+c2.imaginary);
	}//new 붙여야함..what the..

	public static Complex sub(Complex c1, Complex c2) {
		return new Complex(c1.real-c2.real,c1.imaginary-c2.imaginary);
	}//new 붙여야함..what the..

	public String toString()  
    {  
    String form = real + "+" + imaginary +"i" ;  
    return form;  
    }  

}
