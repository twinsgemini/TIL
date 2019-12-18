package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Test04_Iteractor {
	public static void main(String[] args) {
		//List list = new ArrayList();  // 이 경우 Object 타입의 Array
		//List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		System.out.println(list.size());
		list.add("홍길동");
		list.add("김길동");
		list.add("고길동");
		list.add("최길동");
		list.add("홍길동");
		System.out.println(list.size());
		
		System.out.println("----------for 기반 순회----------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("고길동 ? "+list.contains("고길동"));
		
		System.out.println("----------Iterator 기반 순회----------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data.charAt(0)+"**");
		}
		
		System.out.println("----------Iterator 기반 순회----------");
		String rname = JOptionPane.showInputDialog("삭제할 이름을 입력하세요.");
		it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			if(rname.contentEquals(data)) {
				it.remove();
			}
		}
		System.out.println(list);
		list.add(2, "~~~~~~");
		System.out.println(list);
		
		
		
	}
}
