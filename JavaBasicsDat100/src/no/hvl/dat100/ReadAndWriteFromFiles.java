package no.hvl.dat100;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndWriteFromFiles {
    public static void main(String[] args) throws FileNotFoundException {
        // Åpner filen for lesing
        String filnavn = "navn.txt";
        Scanner scanner = new Scanner(new File(filnavn));

        // Skriv hvert linje ut
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        // Lukker filen
        scanner.close();
    }
    }

