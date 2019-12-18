package day04;

public class Test04_Array {

	public static void main(String[] args) {
		int[] eng;         // 배열 선언
		eng = new int[5];  // 배열 생성
		
		eng[0] = 95; 
		eng[1] = 67;
		eng[2] = 68;
		eng[3] = 98;
		eng[4] = 79;
		
		double sum = 0;
		double avg = 0.0;
		for(int i=0; i<eng.length; i++) {
			System.out.print(eng[i]+" ");
			sum+=eng[i];
		}
		System.out.println();
		
		avg = sum / eng.length;
		System.out.printf("eng 합: %d 평균: %.2f %n", (int)sum, avg);
		
		String[] names = new String[5];
		names[0] = "홍길동";
		names[1] = "";
		names[2] = "이길동";
		names[3] = "박길동";
		names[4] = "고길동";
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<names.length; i++) {
			//논리연산자 사용시 null체크를 먼저 해줘야함. length() 먼저 체크시 null일 경우 오류
			if(names[i] != null && names[i].length() > 0) {
				System.out.printf("%c** %d %n", names[i].charAt(0), eng[i]);
			}
		}
		
	}

}
