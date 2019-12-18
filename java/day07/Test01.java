package day07;

public class Test01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.print();
		
		// main 에서는 this 사용. super 키워드 사용 할 수 없다.
		System.out.println(d.kind);
		System.out.println(d.getSuperKind());
		System.out.println(d.kind);
		
	}

}
