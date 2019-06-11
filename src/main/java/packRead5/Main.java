package packRead5;

/*
Napisz aplikację która czyta plik 'output_form.txt' i wypisuje ilość wypełnionych formularzy.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        String linia;
        int licznik = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("formularz.txt"))) {
            while ((linia = bufferedReader.readLine()) != null) {
                licznik++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ilość formularzy: " + (licznik / 6));
    }
}
