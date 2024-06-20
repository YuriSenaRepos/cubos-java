package t21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Insira um número: ");
            num = input.nextInt();
        }

        while (num <=0);{
            System.out.println("O número é positivo: " + num);
        }

    }
}
