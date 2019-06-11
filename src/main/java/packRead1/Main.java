package packRead1;

/*
Stwórz aplikację która służy do odczytywania danych z plików które zapisaliśmy, stwórzmain'a w którym sprawdzaj że w katalogu w którym uruchomiłeś program jest plik o nazwie'output_1.txt' który posiada treść "Hello World!". Jeśli pliku nie ma lub posiada innązawartość napisz odpowiedni komunikat
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();


        if (new File("output_1.txt").exists()) {
            System.out.println("Plik istnieje.");
            System.out.println();
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output_1.txt"))) {
                String linia;
                while ((linia = bufferedReader.readLine()) != null) {
                    if (linia.equals("Hallo World!")) {
                        System.out.println("Plik jest zgodny.");
                    } else {
                        System.out.println("Plik nie jest zgodny.");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Nie ma takiego pliku.");
        }
    }
}
