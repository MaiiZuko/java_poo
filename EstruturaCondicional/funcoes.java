package EstruturaCondicional;

public class funcoes {

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
    
        //Raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        //Elevado ao quadrado
        A = Math.pow(x, y);
        B = Math.pow(x, 2.00);
        C = Math.pow(5.0, 2.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        //Valor absoluto
        A = Math.abs(y);
        System.out.println(A);
    }
    
}
