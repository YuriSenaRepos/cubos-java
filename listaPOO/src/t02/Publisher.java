package t02;

public class Publisher {

	private String name;
	
	Publisher (String name){
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
