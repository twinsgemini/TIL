package util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyUtil {
	
	public static int[] sort(int[] a) {
		
		int[] num = a.clone();
  
		for(int i=0 ; i<num.length-1;i++) {
			int min = i;
			for(int j= i+1;j<num.length ;j++) {
				if(num[min] > num[j]) {
					min = j;
				}
			}
			if(i != min) {  //num[i]   num[min]
				MyUtil.swap(num,i,min);
			}
		
		}

		return num;
	}


public static void swap(int[] num, int i, int min) {
	int temp = num[i];
	num[i] = num[min];
	num[min] = temp;
}
   //두 개의 정수를 입력받아 큰 값을 리턴해주는 max 함수
public static int max(int a, int b) {
	return a>=b ? a:b;
}

public static void iteratorPrint(List<String> list) {
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		String data = (String) it.next();
		System.out.println(data+" ");
	}
}
public static void iteratorPrint(Set<String> list) {
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		String data = (String) it.next();
		System.out.println(data+" ");
	}
}

}






