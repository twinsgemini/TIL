package day07;

public class Student extends Person{
	private int id;
	
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void print(){
		System.out.printf("이    름 : %-6s 나이 : %-6d 학     번 : %d %n", 
				getName(), getAge(), id);
	}
	
}
