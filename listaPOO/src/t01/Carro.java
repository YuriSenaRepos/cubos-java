package t01;

public class Carro {
	private String model;
	private int year;
	private String color;
	
	
	
	Carro (String model, int year, String color){
		this.model = model;
		this.year = year;
		this.color = color;
	

	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	

}
