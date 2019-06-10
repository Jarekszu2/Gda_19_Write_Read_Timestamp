package packZad2;

/*
 Napisz aplikację w której: - wczytaj od użytkownika jedną linię tekstu - po wczytaniu linii otwórz plik o nazwie 'output_2.txt' - zapisz do pliku linię pobraną od użytkownika - zamknij plik
 */

import java.io.*;
import java.util.Scanner;

public class MainZad2 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Podaj tekst do zadania:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // File plik = new File("output_2.txt");
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("output_2.txt"))){
            printWriter.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
