package week3lab;

public class Author {

	private String firstName;
	private String lastName;
	
	public Author(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String last) {
		this.lastName = last;
	}
	
	public String toString() {
		return this.lastName + ", " + this.firstName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
