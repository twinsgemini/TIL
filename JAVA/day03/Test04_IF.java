package day03;

import java.util.Scanner;

public class Test04_IF {

	public static void main(String[] args) {
		System.out.println("App Start ...");
		String name = null;
		int kor, eng, math;
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적처리를 종료하려면 quit 입력하세요.");
		String msg = scanner.nextLine();
		if(msg.toLowerCase().equals("quit")) {
			if(scanner != null) {
				scanner.close();
				scanner = null;
			}
			System.out.println("App End ...");
			return;
		}
		
		System.out.println("이름 국어 영어 수학 점수를 입력하세요.");
		System.out.println("ex)홍길동 90 90 90");
		
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();
		
		double sum = kor+eng+math;
		double avg = sum/3;
		
		System.out.printf("이름: %s %n", name);
		System.out.printf("국어: %d 영어: %d 수학: %d %n", kor, eng, math);
		System.out.printf("평균: %.2f %n", avg);
		
		if(avg >= 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
		scanner = null;
		return ;
	}

}
