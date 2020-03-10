package day09;

public class Test06_throw {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			Thread.sleep(3000); // static
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("-------------------");
		try {
			throw new Exception("예외 실습 ---");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("end");
	}
}
