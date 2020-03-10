package day07.ex;

public class Prob7 {

	public static void main(String[] args) {
		Student[] s;
		Teacher[] t;
		Employee[] e;
		
		Person[] persons = {
			new Teacher("김선생",35,"java"),
			new Teacher("이선생",32,"sql"),
			new Teacher("박선생",29,"DB"),
			new Student("김학생",21,201901),
			new Employee("박사원",37,"교학부")
		};
		
		//오버라이딩을 통해 간소화
		for(Person data : persons) {
			data.print();
		}
/*		
		for(Person data : persons) {
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();
			if(data instanceof Employee) ((Employee)data).print();
		}
*/		
		
	}
}

class Person{
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() { }
}
class Student extends Person{
	private int id;
	
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super(name, age);
		//this.setName(name);
		//this.setAge(age);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){
		super.print();
		System.out.printf("이    름 : %-5s 나이 : %-5d 학    번 : %d %n", 
			this.getName(), super.getAge(), id);	
	}
}
class Teacher extends Person{
	private String subject;
	
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print(){
		System.out.printf("이    름 : %-5s 나이 : %-5d 담당과목 : %s %n", 
				super.getName(), this.getAge(), subject);	
	}
}
class Employee extends Person{
	private String dept;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print(){
		System.out.printf("이    름 : %-5s 나이 : %-5d 부    서 : %s %n", 
				getName(), getAge(), dept);	
	}
}



