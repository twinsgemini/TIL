package day08;

public class Test02 {

	public static void main(String[] args) {
		SingleTone s1 = SingleTone.getInstance();
		SingleTone s2 = SingleTone.getInstance();
		SingleTone s3 = SingleTone.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//모두 같은 주소값을 갖는다
		//heap에 s 하나 올려두고 공유하는 방식?
	}
}


class SingleTone {
	private static SingleTone s;
	private SingleTone() { 
		System.out.println("SingleTone 생성");
	}
	
	
	public static SingleTone getInstance() {
		if(s == null) s = new SingleTone();
		return s;
	}
}