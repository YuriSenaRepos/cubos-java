package t07;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(13,"Fulano");
        conta.Saque(200);
        System.out.println(conta.getSaldo());
    }
}
