package se.skola;

import java.util.Scanner;

public class MorseApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MorseTranslator translator = new MorseTranslator();

        System.out.println("1 = Text till morse");
        System.out.println("2 = Morse till text");
        System.out.print("Val: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // rensar radbrytning

        if (choice == 1) {
            System.out.print("Skriv text: ");
            String input = scanner.nextLine();
            System.out.println("Morse: " + translator.textToMorse(input));

        } else if (choice == 2) {
            System.out.print("Skriv morse: ");
            String input = scanner.nextLine();
            System.out.println("Text: " + translator.morseToText(input));

        } else {
            System.out.println("Ogiltigt val.");
        }

        scanner.close();
    }
}