package edu.db.coustom;

public class Customer {
	private int code;
	private String name, email, hpone;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHpone() {
		return hpone;
	}
	public void setHpone(String hpone) {
		this.hpone = hpone;
	}
	@Override
	public String toString() {
		return "Customer [고객번호=" + code + ", 이름=" + name + ", 이메일=" + email + ", 전화번호=" + hpone + "]";
	}
	
	
}
