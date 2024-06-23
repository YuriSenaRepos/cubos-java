package t02;

public class Book {
private String name;
private int year;
private int edition;
private Publisher publisher;
private Writter writter;

Book (String name, int year, int edition, Publisher publisher, Writter writter){
	this.name = name;
	this.year = year;
	this.edition = edition;
	this.publisher = publisher;
	this.writter = writter;
	
}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Writter getWritter() {
		return writter;
	}

	public void setWritter(Writter writter) {
		this.writter = writter;
	}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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
