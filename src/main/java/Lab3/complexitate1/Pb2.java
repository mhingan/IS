package Lab3.complexitate1;

import java.util.Scanner;

public class Pb2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nIntroduceti un sir de caractere: ");
        String caractere = in.nextLine();

        //transform in tablou de caractere
        char[] caractere_tablou = caractere.toCharArray();

        //afisez tabloul de caractere - optional
//        for (char c : caractere_tablou){
//            System.out.println(c);
//        }


        System.out.println("\nIntroduceti caracterul cautat: ");
        //cautare un anumit caracter - introducem caracterul pe care vrem sa il cautam
        char caracter_cautat = in.nextLine().charAt(0);
        int nr_aparitii = 0;

        //cautam caracterul introdus mai sus in tabloul
        for (char c : caractere_tablou) {
            if (c == caracter_cautat) {
                nr_aparitii++;
            }
        }

        if (nr_aparitii > 0) {
            System.out.println("Numarul de aparitii: " + nr_aparitii);
        } else {
            System.err.println("Nu a fost gasit caracterul cautat.");
        }
    }
}
