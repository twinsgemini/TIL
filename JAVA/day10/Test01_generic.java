package day10;

public class Test01_generic {
	public static void main(String[] args) {
		Employee<String> emp1 = new Employee<String>("홍길동", "2019001");
		System.out.println(emp1);
		System.out.println(emp1.number.charAt(3));
		
		Employee<Integer> emp2 = new Employee<Integer>("고길동", 2019002);
		System.out.println(emp2);
		System.out.println(emp2.number.getClass());
		
		//type 언급 없으면 Object로 반영
		Employee emp3 = new Employee("김길동", 2019003);
		System.out.println(emp3);
		System.out.println(emp3.number.getClass());
		
		
	}
}


class Employee<T> {	// <T>: generic
	String name;
	T number;
	
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	
	
	
	
}