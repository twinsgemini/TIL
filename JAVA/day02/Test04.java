package day02;

public class Test04 {

	public static void main(String[] args) {
		int num = 100;
		num = num + 20;
		System.out.println(num);
		
		int i = 99 , j = 77;
		System.out.printf("(i = %d, j = %d) %n", i, j);
		
		int tmp;
		tmp = i;
		i = j;
		j = tmp;
		System.out.printf("i = %d, j = %d %n", i, j);
		
		tmp = 0;
		
		System.out.println("-------------------");
		char c1 = 'B', c2 = 'w';
		System.out.printf("c1 = %c, c2 = %c %n", c1, c2);
		
		char tmpc = c1;
		c1 = c2;
		c2 = tmpc;
		System.out.printf("c1 = %c, c2 = %c %n", c1, c2);
		
		System.out.println("-------------------");
		String s1 = "hello", s2 = "java";
		System.out.printf("s1 = %s, s2 = %s %n", s1, s2);
		String tmps = s1;
		s1 = s2;
		s2 = tmps;
		System.out.printf("s1 = %s, s2 = %s %n", s1, s2);
	}

}
