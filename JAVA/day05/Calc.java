package day05;

public class Calc {
	
	public static int add(int ... a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int add(int a, int b){
		return a+b;
	}
	public static double add(double a, double b){
		return a+b;
	}
	
	
	
}
