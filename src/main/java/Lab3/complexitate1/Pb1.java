package Lab3.complexitate1;

import java.util.Scanner;

public class Pb1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String luni[] = {"Ianuarie", "Februarie", "Martie", "April", "Mai", "Iunie",
                "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};

        System.out.println("Introduceți un număr între 1 și 12 sau numele unei luni: ");
        String input = in.nextLine(); // Citim input-ul ca string

        try {
            // Încearcă să convertești input-ul la int
            int valoareCitita = Integer.parseInt(input);

            if (valoareCitita >= 1 && valoareCitita <= 12) {
                // Afișează luna corespunzătoare
                System.out.println("Luna este: " + luni[valoareCitita - 1]);
            } else {
                System.err.println("Valoarea introdusă nu este între 1 și 12.");
            }

        } catch (NumberFormatException e) {
            // Dacă input-ul nu este un număr, verificăm dacă este un nume de lună
            boolean lunaGasita = false;
            for (int i = 0; i < luni.length; i++) {
                if (luni[i].equalsIgnoreCase(input.trim())) { // Ignoră majusculele
                    System.out.println("Numărul lunii pentru " + input + " este: " + (i + 1));
                    lunaGasita = true;
                    break;
                }
            }

            if (!lunaGasita) {
                System.err.println("Textul introdus nu corespunde cu nicio lună.");
            }
        }
    }
}
