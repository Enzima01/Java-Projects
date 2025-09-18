package entitites;

public class Book {

	private int id;
	private String title;
	private int pages;
	
	
	public Book() {
	}


	public Book(int id, String title, int pages) {
		this.id = id;
		this.title = title;
		this.pages = pages;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPages() {
		return pages;
	}

	
	public void addPages(int quantity) {
		pages += quantity;
	}
	
	public String toString() {
		return id+", "+ title+ ", "+ pages;
	}
	
	
}
