package t16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] teste = {1,2,3,4,5,6};
        int[] testeInvertido = new int[teste.length];
    for (int i=0; i<teste.length;i++){
        testeInvertido[i] = teste[(teste.length-i-1)];
        System.out.println(i);
        System.out.println(testeInvertido[i]);
        System.out.println("Teste invertido: " + Arrays.toString(testeInvertido));
    }
    }
}
