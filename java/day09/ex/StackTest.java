package day09.ex;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 20; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}

	}
}

class MyStack{
	private int[] stack = null;
	int cnt = 0;
	
	MyStack() {
		stack = new int[10];
	}
	MyStack(int size) {
		if(size < 0) {
			size = 10;
		}
		stack = new int[size];
	}
	
	public void push(int i) {
		if(isFull()) {
			int[] tmp = new int[stack.length*2];
			System.arraycopy(stack, 0, tmp, 0, stack.length);
			stack = tmp;
			tmp = null;
		}
		stack[cnt] = i;
		cnt++;
	}
	public boolean isEmpty() {
		return cnt == 0 ? true:false;
	}
	public boolean isFull() {
		return cnt == stack.length ? true:false;
	}
	public int top() {
		if(isEmpty()) return -1;
		return stack[cnt-1];
	}
	public int pop() {
		if(isEmpty()) return -1;
		return stack[--cnt];
	}
	
	
	
}
