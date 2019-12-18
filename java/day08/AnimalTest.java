package day08;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("진돗개", "캐리"),
				new Fish("쿠쿠")
		};
		
		for(Animal data : animals) {
			data.breath(); // 다형성. 부모타입으로 메소드 호출 > 오버라이딩에 따른 동작
		}
		
	}

}
