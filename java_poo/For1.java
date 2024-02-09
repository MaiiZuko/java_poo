package java_poo;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        //variavel i, iniciando com 0 - só inicia
        //i<n condição enquanto
        //incrimento i vai receber o valor que estava nele +1
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();

    }
}
