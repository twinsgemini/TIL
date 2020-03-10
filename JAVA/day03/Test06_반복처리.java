package day03;

public class Test06_반복처리 {

	public static void main(String[] args) {
		// 반복처리
		//초기값 설정; 조건식; 증감식
		for(int i=0; i<3 ; i++) {
		System.out.printf("Hello Java %d %n", i);
		}
		
		System.out.println("-----------------");
		
		int sum = 0;
		for(int i=1; i<10 ; i++) {
			if(i%2 == 0) {
			System.out.print(i);
			sum += i;
			}
		}
		System.out.println();
		System.out.printf("합: %d %n", sum);
		
		System.out.println("-----------------");
		
		String name = "홍길동";
		System.out.printf("%c** %n", name.charAt(0));
		
		String msg = "hello java";
		System.out.println(msg);
		for(int i=msg.length()-1; i>=0; i--) {
			System.out.print(msg.charAt(i));
		}
		
		//System.out.println("END");
	}

}
