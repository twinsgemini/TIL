package day08;

public class Fish extends Animal{
	String name;
	
	public Fish() {
		super("물고기");
	}
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}

	public void print() {
		System.out.printf("[%s, %s]%n", kind, name);
	}
	
	@Override // 오버라이딩 자동으로 찾아줌(철자 다르면 오류발생)
	public void breath() {
		System.out.println("아가미로 동작 ...");
	}
	
}
