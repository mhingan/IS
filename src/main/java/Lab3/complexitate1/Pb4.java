package Lab3.complexitate1;

import java.util.Scanner;

public class Pb4 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduceti un numar:");
        int a = in.nextInt();

        // Convertim numarul in binar, octal si hexazecimal
        String binar = Integer.toBinaryString(a);
        String octal = Integer.toOctalString(a);
        String hexazecimal = Integer.toHexString(a);

        // Afisam rezultatele
        System.out.println("Reprezentarea binara a numarului este: " + binar);
        System.out.println("Reprezentarea octala a numarului este: " + octal);
        System.out.println("Reprezentarea hexazecimala a numarului este: " + hexazecimal.toUpperCase());

    }

}
