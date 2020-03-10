package day08;

import day07.Animal;

public class Test01 {

	public static void main(String[] args) {
		Animal a = new Animal();
		//System.out.println(a.kind); default는 같은 클래스 내에서만.
		
	}
}

class Dog2 extends Animal{
	public void print(){
		System.out.println(super.kind);
	}
}

