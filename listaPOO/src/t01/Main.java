package t01;

public class Main {

	public static void main(String[] args) {
		Carro corsa = new Carro("Corsa", 1999, "Azul");
		System.out.println(corsa.getModel());
		corsa.setColor("Vermelho");
		System.out.println(corsa.getColor());
		System.out.println(corsa.getYear());

	}

}
