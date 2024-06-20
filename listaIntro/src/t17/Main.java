package t17;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{7,2,3,2,6},
                          {2,5,2,2,3}};
        int soma  = 0;
        int qtdSoma = 0;

        for ( int i =0; i<matriz.length; i++){
           for (int y = 0 ; y < matriz[i].length ; y++){
               soma = matriz[i][y] + soma;
               qtdSoma++;
               System.out.println("soma atual: " + soma);
               System.out.println("qtdSoma atual: " + qtdSoma);

           }


        }
        int media = 0;
        media = soma/qtdSoma;
        System.out.println(matriz.length);
        System.out.println(matriz[1].length);

        System.out.println("A media é:" + media);


    }
}
