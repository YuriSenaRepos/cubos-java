package t20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = input.nextInt();
        int i =1;
        while ( i <= num){
            System.out.println(i);
            i++;
        }


    }
}
