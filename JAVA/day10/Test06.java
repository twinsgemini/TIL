package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		Set<Book> bookList = new HashSet<Book>();
		
		// 등록
		if(bookList.add(new Book("java", 500))) {
			System.out.println("등록완료");
		}else {
			System.out.println("이미 등록된 데이터가 있습니다.");
		}
		bookList.add(new Book("sql", 1500));
		bookList.add(new Book("jsp", 5000));
		bookList.add(new Book("스프링 5", 4000));
		bookList.add(new Book("하둡", 2500));
		bookList.add(new Book("R", 3800));
		bookList.add(new Book("java", 500));
		bookList.add(new Book("java", 500));// Book클래스 equals오버라이드 하지않으면 
											// Object 로서 주소값 비교하여 중복으로 처리 안된다.
		
		// 출력
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);;
		}
		
		// 검색
		String keyword = JOptionPane.showInputDialog("검색: (도서명을 입력하세요.)");
		System.out.println(keyword + " 도서 검색 결과");
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if(book.title.toUpperCase().contains(keyword.toUpperCase())) {
				System.out.println(book);
			}
		}
		
		// 삭제
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 도서 이름 입력하세요.");
		String msg = scanner.nextLine().trim();
		
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.title.contains(msg)) {
				System.out.println(book);
				System.out.println("삭제할까요? (y입력:삭제)");
				String yy = scanner.nextLine().trim();
				if(yy.equalsIgnoreCase("y")) {
					it.remove();
				}
			}
		}
				
		// 출력
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		// 수정
		System.out.println("수정할 도서 이름 입력하세요.");
		msg = scanner.nextLine().trim();
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			
			if(book.title.contains(msg)) {
				book.title = book.title+"__";
			}
		}
		
		
		// 출력
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		
		scanner.close();
		scanner = null;
	}
}

