package day07;

public class Teacher extends Person{
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
		System.out.printf("이    름 : %-6s 나이 : %-6d 담당과목 : %s %n", 
				getName(), getAge(), subject);
	}
	
}
