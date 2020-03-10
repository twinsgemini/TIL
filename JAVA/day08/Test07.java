package day08;

public class Test07 {

	public static void main(String[] args) {
		Circle_a a = new Circle_a();
		System.out.println(a.cArea(5));
		a.print();
		a.color = "~~~~";
		System.out.println(a.color);
		
		Circle_i i = new Circle_i();
		System.out.println(a.cArea(5));
		//i.color = "~~~";
		System.out.println(i.color);
		
		
		
	}
}

class Circle_a extends Shape_a{
	public double cArea(double r){
		return r*r*Math.PI;
	}
}

abstract class Shape_a {
	String color;
	public abstract double cArea(double r);
	public void print() {
		
	}
}

interface Shape_i {
	final static String color="red";
	public double cArea(double r); // abstract 만 올수 있으므로 abstract 생략가능
}

class Circle_i extends Object implements Shape_i{

	@Override
	public double cArea(double r) {
		return r*r*Math.PI;
	}
	
}
