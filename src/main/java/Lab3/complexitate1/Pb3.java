package Lab3.complexitate1;

import java.util.Scanner;

import static java.lang.System.arraycopy;

public class Pb3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nIntroduceti un sir de caractere: ");
        String caractere = in.nextLine();

        //transform in tablou de caractere
        char[] caractere_tablou = caractere.toCharArray();


        if(caractere_tablou.length>=3){

       char[] caractere_3 = new char[3];
       System.arraycopy(caractere.toCharArray(), 0, caractere_3, 0, 3);


           System.out.println("Primele 3 caractere sunt: ");
           for(char c : caractere_3){
               System.out.println(c + " ");
           }
       } else {
           System.err.println("Sirul initial are mai putin de 3 caractere");
       }


    }
}
