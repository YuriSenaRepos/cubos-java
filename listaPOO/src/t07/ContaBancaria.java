package t07;

public class ContaBancaria {
    private double saldo;
    private String titular;


    ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void Saque(double saque){
        if(saldo >= saque){
            this.saldo = saldo - saque;
        } else System.out.println("Saldo insuficiente");


    }

    public void Deposito(double deposito){
        saldo = saldo + deposito;

    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
