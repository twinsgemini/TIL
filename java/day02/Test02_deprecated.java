package day02;

import java.util.Date;

public class Test02_deprecated {

	public static void main(String[] args) {
		String msg = "hello java ~~~";
		System.out.println(msg);
		
		int size = msg.length();
		System.out.println(size);
		System.out.println(msg.toUpperCase());
		
		System.out.println(msg.length());
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
		
		java.sql.Date date2;

	}

}
