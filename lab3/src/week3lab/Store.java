package week3lab;

public class Store {
	
	private Book[] books;
	
	public Store(Book[] b) {
		this.books = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1 = new Author("Winder", "Russell");
		Author a2 = new Author("Roberts", "Graham");
		Author[] as = {a1, a2};
		
		Book b1 = new Book("Developing Java Software", as, "978-0470090251", 7995);
		
		System.out.println(b1);
	}

}
