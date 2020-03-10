package day03;

public class Test02_비트연산자 {

	public static void main(String[] args) {
		//비트연산자
		System.out.println(1<<0);
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println(1<<3);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(1>4 & 4<0); //false
		System.out.println(1&4); // 0 (비트연산 0000)
		System.out.println(1|4); // 5 (비트연산 0101)
	}

}
