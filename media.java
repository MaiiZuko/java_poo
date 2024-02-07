package java_poo;

import java.util.Scanner; //Usada para ler entrada do teclado

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Criando o objeto scanner para ler entrada do teclado
        double x, y, media;

        System.out.print("Digite o primeiro número: ");
        x = sc.nextDouble(); //Le a próxima entrada do teclado e a converte em um número do tipo double
        System.out.print("Digite o segundo número: ");
        y = sc.nextDouble();
        media = (x+y)/ 2.0;
        System.out.print("Media = " + media);
        sc.close(); //Scanner é fechado após o número ter sido lido no teclado
    }
}