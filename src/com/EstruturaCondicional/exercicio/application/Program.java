package src.com.EstruturaCondicional.exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import src.com.EstruturaCondicional.exercicio.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity");
        product.quantity = sc.nextInt();

        System.out.println(product);
        sc.close();
    }
    
}
