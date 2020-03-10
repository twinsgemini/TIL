package day04;

import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int i=strData.length-1; i>=0; i--) {
			for(int j=strData[i].length()-1;j>=0;j--) {
				System.out.print(strData[i].charAt(j));
			}
			System.out.println();
		}
		
/*		
		-------------  연습해보세요~~~  --------

		예제 )문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
		 >
		 String msg = "yes";
		 if(msg.equals("yes")) true;
		  
		예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
		      몇까지 더해야 총합이  100  이상이 되는지 구하시오 .
		 

		예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .

		class Exercise2 { 
			public static void main(String[] args) { 
				int[] arr = {10, 20, 30, 40, 50}; 
				
				// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
				
				System.out.println("sum="+sum);
			 } 
		}
*/		
		
		int i = 1;
		int sum = 0;
		while(true) {
			if(i%2==1) {
				sum += i;
			} else {
				sum -= i;
			}
			if(sum>=100) {
				System.out.println(i);
				System.out.println(sum);
				break;
			}
			i++;
		}
		
		int[] arr = {10, 20, 30, 40, 50}; 
		sum = 0;
		for(i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
		
		
		//배열에 난수 넣고 중복값은 넣지 않게하기.
		
		int[] num = new int[10];
		int r;
		i=0;
		A: while(true) {
			r = (int)(Math.random()*100)+1;
			System.out.print(r+" ");
			for(int j=0; j<i; j++) {
				if(num[j]==r) {
					System.out.print("! ");
					continue A;
				}
			}
			num[i]=r;
			i++;
			if(i==num.length) break;
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
	}

}
