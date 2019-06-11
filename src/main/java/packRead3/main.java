package packRead3;

/*
Stwórz aplikację która czyta plik 'output_3.txt' i zlicza słowa i linie w tym pliku.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        System.out.println();

        int licznikLinii = 0;
        int licznikSlow = 0;
        String razem = "";
        String linia;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output_3.txt"))) {
            while ((linia = bufferedReader.readLine()) != null) {
                // System.out.println(linia);
                String[] slowa = linia.split(" ");
                licznikLinii++;
                licznikSlow += slowa.length;
                razem += linia;
                System.out.println();
                System.out.println(razem);
            }
            System.out.println();
            System.out.println("Ilość słów: " + licznikSlow);
            System.out.println("Ilość linii: " + licznikLinii);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
