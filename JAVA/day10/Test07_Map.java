package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test07_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("java01", "1234");
		map.put("java02", "5678");
		map.put("java03", "1221");
		map.put("java04", "1478");
		map.put("java05", "0258");
		map.put("java06", "0528");
		map.put("java07", "1122");
		map.put("java08", "1234");
		map.put("java09", "1111");
		map.put("java10", "1234");
		map.put("java11", "5678");
		map.put("java12", "1588");
		
		// map 구조 순회
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String id = (String) it.next();
			System.out.println(id+" "+map.get(id));
		}
		
		// 로그인 처리
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID 입력하세요");	
			String id = scanner.nextLine().trim();
			System.out.println("PW 입력하세요");
			String pw = scanner.nextLine().trim();
			

			if(!map.containsKey(id)) {
				System.out.println("ID 없음");
				continue;
			}else {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패. PW 확인해주세요.");
				}
			}
			
		}
		
		
		
		scanner.close();
		scanner = null;
		
		System.out.println("END");
	}
}
