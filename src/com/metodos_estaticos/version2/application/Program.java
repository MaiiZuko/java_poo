package src.com.metodos_estaticos.version2.application;

import src.com.metodos_estaticos.version2.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double raio = sc.nextDouble();

        double c = calc.circumference(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

        sc.close();
    }
    
}

