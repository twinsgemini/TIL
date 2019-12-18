package day02;

public class Test06_삼항연산자 {

	public static void main(String[] args) {
		int num = 99;
		num = num +1;
		System.out.println(num);
		num += 1;
		System.out.println(num);
		System.out.println(num % 10);
		System.out.println(num / 10);
		System.out.println(num++); //
		System.out.println(++num); //
		
//		int jumsu = 90;
//		System.out.println("우수? " + (jumsu >= 80));
		
//		boolean flag = jumsu >= 80;
//		System.out.println("우수? " + flag);
		
		int jumsu= -70;
		boolean flag = jumsu >= 80;
		System.out.println("우수? " + flag);
		flag = jumsu >= 0 && jumsu <=100;
		System.out.println("유효성? " + flag);
		
		System.out.println("--------------");
		System.out.printf("%c -> %d %n", '0', (int)'0');
		System.out.printf("%c -> %d %n", 'A', (int)'A');
		System.out.printf("%c -> %d %n", 'a', (int)'a');
		//소문자와 대문자의 ASCII 코드 차이는 32
		char c = 'c';
		System.out.printf("숫자니? %b %n", Character.isDigit(c));
		flag = c>='0' && c<='9';
		System.out.printf("숫자니? %b %n", flag);
		flag = c>='a' && c<='z';
		System.out.printf("소문자니? %b %n", flag);
		System.out.printf("%c -> %c %n", c, (char)(c-32));
		
		//삼항연산자
		int score = 50;
		String result = score > 70 ? "pass":"재시험";
		System.out.println(score + " : " + result);
		System.out.println("-------------------");
		char ch = 'a';
		char r = (ch>='a' && ch<='z') ? (char)(ch-32):ch;
		System.out.println(ch + " -> " + r);
	}

}
