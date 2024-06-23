package q02;

public class Book extends Publisher {
private String name;
private int year;
private int edition;

Book (String name, int year, int edition, String PublisherName){
	this.name = name;
	this.year = year;
	this.edition = edition;
	super this.publisherName = publisherName
	
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
