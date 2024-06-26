package t05;

public class Main {
    public static void main(String[] args) {
        System.out.println("4 + 5 é: " + new Calculadora().Sum(4,5));
        System.out.println("4 - 5 é: " + new Calculadora().Sub(4,5));
        System.out.println("4 * 5 é: " + new Calculadora().Mult(4,5));
        System.out.println("4 / 5 é: " + new Calculadora().Div(4,5));

    }
}
