package src.com.poo.vetores.exemplo;

import java.util.Locale;
import java.util.Scanner;

import src.com.poo.vetores.exemplo.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        //n ou vect.length - quantidades de número no vetor
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("avarage price: " + avg);

        sc.close();
    }
}
