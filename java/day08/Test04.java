package day08;

public class Test04 {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1+" "+msg2);
		System.out.println(msg1.equals(msg2));
		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("홍길동", 22);
		Person p3 = null;
		System.out.println(p1+" "+p2);
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(msg1));
		
		
		
		
		
		System.out.println("------------------");
		
		System.out.println(msg1.toString());
		System.out.println(msg2);
		System.out.println(p1);
		System.out.println(p2.toString());
		
		Object obj = p1;
		System.out.println(obj.toString());
		System.out.println(((Person)obj).name); //다운캐스팅
		
		obj = msg1;
		System.out.println(obj.toString());
		System.out.println(((String)obj).toUpperCase()); //다운캐스팅
	}
}


class Person {
	String name;
	int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person["+name+" : "+age+"]";
	}
	@Override
	public boolean equals(Object obj) {
		boolean f = false;
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(name.equals(p.name) && (age == p.age)) {
				f = true;
			}
		}
		
		
		return f;
	}
}