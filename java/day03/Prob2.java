package day03;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		String encodedString2 = "";
		StringBuilder sb = new StringBuilder();
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		for(int i=0; i < sourceString.length(); i++) {
			char tmp = sourceString.charAt(i);
			if(tmp>='a' && tmp<='w') {
				encodedString = encodedString+(char)(tmp+3);
			} else if(tmp>='x' && tmp <= 'z') {
				encodedString = encodedString+(char)(tmp-25+2);
			} else {
				encodedString = encodedString+tmp;
			}
		}
		// 프로그램 구현부 끝.

		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		for(int i=0; i < sourceString.length(); i++) {
			char tmp = sourceString.charAt(i);
			tmp = tmp>='a' && tmp<='w' ? (char)(tmp+3): 
				tmp>='x' && tmp <='z' ? (char)(tmp-23):tmp;
			encodedString2 = encodedString2+tmp;
			sb.append(tmp);
		}
		
		// 프로그램 구현부 끝.
		
		encodedString = sb.toString();
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		System.out.println("암호화된 문자열 : " + encodedString2);
		
		
		
		//
		int sum = 0; 
		//ToDo
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println("sum="+sum); 
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=i; j>0; j--) {
				System.out.print(j+" ");
				sum += j;
			}
			System.out.println();
		}
		System.out.println("sum="+sum); 
		
		
	}
}
