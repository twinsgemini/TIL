package day03;

import java.util.Scanner;

public class Test03_scanner_메모리구조 {

	public static void main(String[] args) {
		String name = null;
		int kor = 0;
		int math = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요_");
		name = scanner.nextLine();
		System.out.println(name.length());
		System.out.println("국어 점수를 입력하세요_");
		kor = Integer.parseInt(scanner.nextLine());
		System.out.println("수학 점수를 입력하세요_");
		math = scanner.nextInt(); //nextInt()는 nextLine()과 다르게 마지막 엔터를 소진하지 않는다
		scanner.nextLine(); //nextInt()에서의 엔터값을 소진하기위해 써준다
		
		System.out.printf("이름: %s 국어: %d 수학: %d %n", name, kor, math);
		double avg = (kor+math)/2.;
		System.out.printf("평균: %.2f %s %n", avg, avg>=80 ? "합격":"불합격");
		
		if(scanner != null) scanner.close(); // 자원반납, heap-키보드(입력)연결 끊음
		//null 만 해주면 garbage처리가 안됌(자원반납 안됌)
		scanner = null; //null은 garbage클래스의 대상임을 명시, scanner객체의 주소지움, stack-heap연결 끊음
		return;
		//String 객체는 보통 new를 사용하지 않기때문에 '코드표'에 생성되어있어 null처리 하지 않는다

	}

}
