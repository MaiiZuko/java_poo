package src.com.metodos_estaticos.exercicio.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double REAIS = 4.97;
    public static void main(String[] args) {
        
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dollares você gostaria de comprar? ");
        double comprar = sc.nextDouble();

        double c = conversao(comprar);

        System.out.println(conversao(comprar));
        sc.close();

    }

    public static double conversao(double comprar) {
        return comprar * REAIS;
    }
}
