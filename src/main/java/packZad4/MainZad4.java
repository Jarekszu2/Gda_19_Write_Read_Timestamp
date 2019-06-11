package packZad4;

/*
 Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji i czy mamyprawa do odczytu/zapisu do tego pliku/katalogu
 */
import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MainZad4 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do zadania:");
        // String nazwaPliku = scanner.next();

        File file = new File("output_3.txt");
        if (file.exists()) {
            System.out.println("Plik istnieje.");
            if (file.isFile()) {
                System.out.println("To jest plik.");
            }
            if (file.isDirectory()) {
                System.out.println("To jest katalog.");
            }

            Timestamp timestamp = new Timestamp(file.lastModified());
            LocalDateTime localDateTime = timestamp.toLocalDateTime();
            System.out.println("Last modified: " + localDateTime);
            System.out.println("Rozmiar: " + file.length());
            System.out.println("Zapis: " + file.canWrite());
            System.out.println("Odczyt: " + file.canRead());
            System.out.println("Wykonanie: " + file.canExecute());
        } else {
            System.out.println("Plik nie istnieje.");
        }
    }
}
