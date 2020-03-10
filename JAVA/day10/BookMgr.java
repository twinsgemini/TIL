package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BookMgr {
	Set<Book> booklist;
	Iterator<Book> it;
	public BookMgr() {
		super();
		this.booklist = new HashSet<Book>();
	}
	
	// 등록
	public void add(String title, int price) {
		booklist.add(new Book(title, price));
	}
	
	//출력
	public void print() {
		System.out.println("--------책 목록--------");
		it = booklist.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
	
	//검색
	public void search(String word) {
		System.out.println(word+" 검색어로 책 목록을 검색합니다.");
		it = booklist.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			if(book.title.toUpperCase().contains(word.toUpperCase())) {
				book.print();
			}
		}
	}
	
	//삭제
	public void delete(String word) {
		it = booklist.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			if(book.title.toUpperCase().contains(word.toUpperCase())) {
				Scanner scanner = new Scanner(System.in);
				System.out.println(book.title+" 삭제할까요? (y 입력: 삭제)");
				if(scanner.nextLine().equals("y")) {
					it.remove();
				}
				
			}
		}
	}
	
	//수정
	
	
	
	/*
	Book[] bookList = null;
    int cnt = 0;
    
    
    public BookMgr(){
    	bookList = new Book[10];
    }
    public BookMgr(int size){
    	bookList = new Book[size];
    }
    
	public void addBook(Book book){
		if(cnt == bookList.length) {
			Book[] temp  = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
			temp = null;
		}
		bookList[cnt] = book;
		cnt++;
	}
	public void printBookList(){
		System.out.println("***********  Book List ************");
		for(int i = 0; i<cnt ;i++) {
			bookList[i].print();
		}
	}
	public void printTotalPrice(){
		int sum = 0;
		for(int i = 0; i<cnt ;i++) {
			 sum += bookList[i].getPrice();
		}
		System.out.println("총합계 : "+sum);
	}
	*/
}
