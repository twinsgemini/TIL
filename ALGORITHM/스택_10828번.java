package Test;
import java.util.*;
public class 스택_10828번{
	static ArrayList<Integer> stack = new ArrayList<Integer>();
	static int i = 0;
	
	public static void push(int num) {
		stack.add(num);
		i++;
	}
	public static int pop() {
		if(i==0) {
			return -1;
		}
		int tmp = stack.get(--i);
		stack.remove(i);
		return tmp;
	}
	public static int size() {
		return stack.size();
	}
	public static int empty() {
		if(i==0) {
			return 1;
		}
		return 0;
	}
	public static int top() {
		if(i==0) {
			return -1;
		}
		return stack.get(i-1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int testCase=0;
		testCase = sc.nextInt();
		sc.nextLine();
		
		while(testCase>0) {
			String word = sc.nextLine();
			String[] words = word.split(" ");
			
			if(words[0].equals("push")) {
        		push(Integer.parseInt(words[1]));
        	}else if (words[0].equals("pop")) {
        		System.out.println(pop());
			}else if(words[0].equals("size")) {
				System.out.println(size());
			}else if(words[0].equals("empty")) {
				System.out.println(empty());
			}else if(words[0].equals("top")) {
				System.out.println(top());
			}
			
			testCase--;
		}
	}
}
