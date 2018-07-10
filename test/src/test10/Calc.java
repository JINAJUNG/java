package test10;

public class Calc {

	public void add(int a, int b) {
		System.out.println(a+b); 
	}
	
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiple(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}

//	public int calc(String op, int num1, int num2) {
//		//equals, ==의 차이
//		//equals : 객체의 값! 비교
//		//==객체자체를 비교
//		if(op.equals("+")) {
//			return add(num1,num2);
//		}else if(op.equals("-")) {
//			return minus(num1,num2);
//		}else if(op.equals("*")) {
//			return multiple(num1, num2);
//		}else if(op.equals("/")) {
//			return divide(num1, num2);
//		}else {
//			return -1;
//		}
//	}
}
