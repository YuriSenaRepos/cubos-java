package t05;

public class Calculadora {

    private double num1;
    private double num2;
    private double result;

    Calculadora () {};


    public double Sum (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        result = num1 + num2;
        return result;
    }

    public double Sub (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        result = num1 - num2;
        return result;
    }
    public double Mult (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        result = num1 * num2;
        return result;
    }
    public double Div (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        result = num1 / num2;
        return result;
    }

}
