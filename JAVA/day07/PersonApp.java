package day07;

public class PersonApp {

	public static void main(String[] args) {
		Person[] persons = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과")
		};
		
		for(Person data : persons) {
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();
			if(data instanceof Employee) ((Employee)data).print();
			
		}
		
		
	}

}
