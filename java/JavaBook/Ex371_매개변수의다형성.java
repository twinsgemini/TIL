package JavaBook;

public class Ex371_매개변수의다형성 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}


class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+" 구입 완료.");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break;
			
			sum += item[i].price;
			itemList += item[i]+", ";
		}
		System.out.println("구입 물품 총금액은 "+sum+"만원 입니다.");
		System.out.println("구입 물품은 "+itemList+"입니다.");
	}
}
