package EstruturaCondicional;


import java.util.Locale;
import java.util.Scanner;

public class sintaxeopcional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //convenções dos Estados Unidos
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;

        if (minutos > 100) {
            conta = conta + (minutos - 100) *2;
        }

        System.out.println(conta);
        sc.close();
    }
    
}
