package t02;

public class Author {
	private String name;
	
	Author (String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
