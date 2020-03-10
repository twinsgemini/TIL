package day08.Prob;

public class Rectangular extends Shape{
	private double width;
	private double hight;
	private double area;
	
	public Rectangular() {
		super();
	}
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
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
	
	@Override
	void calculationArea() {
		area = width*hight;
	}
	@Override
	void print() {
		System.out.println(getName()+"의 면적은 "+area);
	}
	
	
}
