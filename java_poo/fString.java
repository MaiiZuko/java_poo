package java_poo;

public class fString {
    public static void main(String[] args) {
        /* 
        String original = "abc ABC";

        String s1 = original.trim();
        String s2 = original.substring(2);
        String s3 = original.substring(2, 4);
        String s4 = original.replace('a', 'x');

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(i);
        System.out.println(j);
*/
        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
