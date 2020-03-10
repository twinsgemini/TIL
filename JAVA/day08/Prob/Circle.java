package day08.Prob;

public class Circle extends Shape{
	private double radius;
	private double area;
	
	public Circle() {
		super();
	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	void calculationArea() {
		area = radius*radius*Math.PI;
	}
	@Override
	void print() {
		System.out.println(getName()+"의 면적은 "+area);
	}
	
	
	
}
