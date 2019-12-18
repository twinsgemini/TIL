package day08;

import day08.Circle;

public class Test08 {

	public static void main(String[] args) {
		Moveable[] s = {
			new Circle(),
			new Rectangle()
			};
		for(Moveable data : s) {
			data.move();
			((Drawable)data).draw();
		}
		System.out.println("--------------");
		
		T[] t = {
				new Circle(),
				new Rectangle()
		};
		for(T data : t) {
			data.draw();
			data.move();
		}
		
	}
}

interface Drawable{
	void draw();
}
interface Moveable{
	void move();
}

interface T extends Drawable, Moveable{} // 인터페이스의 다중상속

class Circle implements T{
	String name = "Circle";

	@Override
	public void move() {
		System.out.println(name+"  이동(move)");
	}
	@Override
	public void draw() {
		System.out.println(name+"  그리기(draw)");
	}
}

class Rectangle implements T{
	String name = "Rectangle";

	@Override
	public void move() {
		System.out.println(name+"  이동(move)");
	}
	@Override
	public void draw() {
		System.out.println(name+"  그리기(draw)");
	}
			
}