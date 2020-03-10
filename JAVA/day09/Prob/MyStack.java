package day09.Prob;

public class MyStack {
	int[] stack= new int[10];
	int i = 0;
	
	public MyStack() {
		super();
	}
	public MyStack(int size) {
		if(size < 0) {
			this.stack = new int[10];
		}else {
			this.stack = new int[size];
		}
	}
	
	void push(int num) {
		if(i < stack.length) {
		stack[i] = num;
		i++;
		}
	}
	boolean isEmpty() {
		if(i < stack.length) return true;
		return false;
	}
	boolean isFull() {
		if(i == stack.length) return true;
		return false;
	}
	int top() {
		if(i>0) {
			return stack[i-1];
		}
		return -1;
	}
	int pop() {
		if(i>0) {
			i--;
			return stack[i];
		}
		return -1;
	}
}
