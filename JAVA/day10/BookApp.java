package day10;

public class BookApp {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		mgr.add("java", 5000);
		
		mgr.print();
		
		mgr.search("j");
		
		mgr.delete("j");
		
		mgr.print();
		
		/*
		BookMgr mgr = new BookMgr(3);
        
		Book book = new Book("java", 33000);
		mgr.addBook(book);
		
		mgr.addBook(new Book("SQL",22000));
		mgr.addBook(new Book("HTML5",27000));
		
		mgr.addBook(new Book("Oracle",17000));
		mgr.printBookList();

		mgr.printTotalPrice();
		*/
	}
}
