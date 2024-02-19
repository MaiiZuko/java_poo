package src.com.poo.vetores.exercicio;


import java.util.Locale;
import java.util.Scanner;

import src.com.poo.vetores.exercicio.entities.Pessoas;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        //n ou vect.length - quantidades de número no vetor
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble(); 
            vect[i] = new Pessoas(name, idade, altura);
        }

        sc.close();
    }
}
