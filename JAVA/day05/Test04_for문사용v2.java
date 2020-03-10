package day05;

public class Test04_for문사용v2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};
		for(int data : num) {
			if(data%2 != 0) System.out.print(data);
		}
		System.out.println();
		
		char[] c = "ABCD".toCharArray();
		for(char data : c) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		String[] s = {"hello","java","test"};
		for(String data : s) {
			if(data.charAt(0) == 't') System.out.println(data);
		}
		
		
	}

}
