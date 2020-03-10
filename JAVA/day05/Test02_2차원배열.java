package day05;

import java.util.Arrays;

public class Test02_2차원배열 {

	public static void main(String[] args) {
		int[][] t1 = new int[4][3];
		for(int i=0; i<t1.length; i++) {
			for(int j=0; j<t1[i].length; j++) {
				System.out.print(t1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int i=0; i<t1.length; i++) {
		System.out.println(Arrays.toString(t1[i]));
		}
		System.out.println();
		
		int[][] t2 = {{1,2,3},{4,5,6,7,8,9},{1},{9,8,7}};
		for(int i=0; i<t2.length; i++) {
			System.out.println(Arrays.toString(t2[i]));
		}
		System.out.println();
		for(int i=0; i<t2.length; i++) {
			for(int j=0; j<t2[i].length; j++) {
				System.out.print(t2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		char[] c = new char[5];
		c[0] = 'A';
		c[1] = 'B';
		
		char[] c1 = {'A','B','C','D'};
		System.out.println(Arrays.toString(c1));
		
		String a = "hellojava"; //char타입의 배열로 관리되어진다.
		//char타입 배열과 String은 같지 않다.
		char[] aa = a.toCharArray();
		System.out.println(a);
		System.out.println(Arrays.toString(aa));
		
	
		
		
		
	}

}
