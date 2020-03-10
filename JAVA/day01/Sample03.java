package day01;

public class Sample03 {
	public static void main(String[] args) {
		System.out.println("홍길동"+'A'+true+3.14+300); // 성능저하 원인
		System.out.printf("%s %c %b %.2f %d %n", "홍길동",'A',true,3.14,300);
		
	}
}
