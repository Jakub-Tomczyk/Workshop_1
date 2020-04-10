package pl.Coderslab.Game_01;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random(); // Losowe wybieranie liczby.
        int randomNumbers = r.nextInt(100); // zakres z jakiego ma wybierać liczbę.

        Scanner scanner = new Scanner(System.in); // komenda do wpisywania danych z konsoli
        System.out.println("Guess the number between 1 and 100");
        while (true) { //
            while (!scanner.hasNextLine()) {
                scanner.nextLine();
                System.out.println("This must be a number"); // robię warunke aby to była liczba a nie słowo czy wyraz
            }
            int some = scanner.nextInt();
            if (some > randomNumbers) {
                System.out.println("Is to high, choose smaller one");
            } else if (some < randomNumbers) {
                System.out.println("Is to small, choose bigger one");
            } else {
                System.out.println("Congratulation. You choose proper one");
                break;
            }
        }
    }

}


//Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:
//
//wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
//sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.