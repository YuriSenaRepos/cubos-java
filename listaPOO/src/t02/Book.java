package t02;

public class Book {
private String title;
private int year;
private int edition;
private Publisher publisher;
private Author author;

Book (String title, int year, int edition, Publisher publisher, Author author){
	this.title = title;
	this.year = year;
	this.edition = edition;
	this.publisher = publisher;
	this.author = author;
	
}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getEdition() {
	return edition;
}

public void setEdition(int edition) {
	this.edition = edition;
}



}
