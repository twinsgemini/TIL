package day08.Prob;

public abstract class Shape {
	private double area;
	private String name;
	
	public Shape() {
		super();
	}
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	abstract void calculationArea();
	
	void print(){}	
}
