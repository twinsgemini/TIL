package Test;
import java.util.*;
public class 회문_recursive{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(myRecursive(word, word.length()));
	}
	
	public static boolean myRecursive(String word, int length) {
		if(length >= 1) {
			if(word.charAt(length-1) == word.charAt(word.length()-length)) {
				if(length == 1) return true;
				return myRecursive(word, length-1);
			}
			return false;
		}
		return false;
	}
	
}
