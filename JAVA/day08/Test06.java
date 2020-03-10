package day08;

public class Test06 {

	public static void main(String[] args) {
		//Animal a = new Animal(); // 객체생성 > abstract Animal은 new 사용불가
		Animal[] a = new Animal[5]; // 객체생성 아니다.
		
		
	}
}




//매개변수의 다형성
class Product{
	String number;
	int price;
}

class TV extends Product{
	
}

class Computer extends Product{
	
}

class Buyer{
	/*
	void buy(TV i){
		
	}
	void buy(Computer i){
		
	}
	*/
	void buy(Product p) {
		
	}
}
