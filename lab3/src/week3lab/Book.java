package week3lab;

public class Book {

	private String title;
	private Author[] authors;
	private String isbn;
	private int price;
	
	public Book(String t, Author[] auths, String i, int cents){
		this.title = t;
		this.authors = auths;
		this.isbn = i;
		this.price = cents;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public Author[] getAuthors() {
		return this.authors;
	}
	
	public void setAuthors(Author[] auths) {
		this.authors = auths;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String i) {
		this.isbn = i;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int cents) {
		this.price = cents;
	}
	
	public String toString(){
		String allauths = new String();
		for(int i = 0; i < authors.length - 1; i++){
			allauths += authors[i];
		}
		allauths += " and " + authors[authors.length - 1];
		
		return "Developing Java Software (" + isbn + ", $" + price + ", by " + allauths + ")"; 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
