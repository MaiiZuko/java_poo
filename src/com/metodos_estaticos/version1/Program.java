package src.com.metodos_estaticos.version1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //a partir que é colocado final esse valor é constante, nunca vai mudar
    // padrão de constantes letra maiuscula
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double raio = sc.nextDouble();

        double c = circumference(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }


    public static double circumference(double raio) {
        return 2.0 * PI *raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI *raio *raio *raio / 3.0;
    }
    
}
