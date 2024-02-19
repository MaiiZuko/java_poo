package src.com.poo.vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; //n elementos conforme a pessoa colocar

        //pegar a lista de vetores e guardar
        for (int i=0; i<n; i++){ //Contador repete enquanto for menor que n
            //leitura dos dados do vetor
            vect[i] = sc.nextDouble(); //variavel i recebe o que o usuario colocar - tamanho de n
        }

        sc.close();
    }
}
