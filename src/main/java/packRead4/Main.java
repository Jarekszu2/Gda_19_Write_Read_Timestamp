package packRead4;

/*
Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.
 */

import packZad5_Formularz.Formularz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("formularz.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                String[] tab = linia.split("=");
                // System.out.println(Arrays.toString(tab));
                // System.out.println(tab[0]);
                System.out.println(tab[1]);
//                System.out.println(linia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
