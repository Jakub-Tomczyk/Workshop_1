package pl.Coderslab.Game_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose number between 1 and 1000 and I will try to guess");
        int min = 1;
        int max = 1000;
        int middle = ((max - min)/2) + min;
        System.out.println("I guess this number is: " + middle);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Your answer is: ");
            String myAnwser = scan.nextLine();
            if ((!myAnwser.equalsIgnoreCase("more")) && (!myAnwser.equalsIgnoreCase("less")) && (!myAnwser.equalsIgnoreCase("Good job")) ) {
                scan.next();
                System.out.println("Wrong answer");
            }
            if (myAnwser.equalsIgnoreCase("trafiłeś"))
                break;
            if (myAnwser.equalsIgnoreCase("less")) {
                max = middle;
                middle = ((max - min) /2) + min;
                System.out.println("I guess this number is: " + min);
            }
            if (myAnwser.equalsIgnoreCase("more")){
                min = middle;
                middle = ((max - min) /2) + min;
                System.out.println("I guess this number is: " + min);
            }
        }

    }
}

// Odwróćmy teraz sytuację z warsztatu "Gra w zgadywanie liczb": to użytkownik pomyśli sobie liczbę z zakresu 1-1000,
// a komputer będzie zgadywał i zrobi to maksymalnie w 10 ruchach (pod warunkiem, że gracz nie będzie oszukiwał).
//
// Zadaniem gracza będzie udzielanie odpowiedzi "więcej", "mniej", "trafiłeś".
//
// Na następnym slajdzie znajduje się schemat blokowy algorytmu.