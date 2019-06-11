package packRead2;

/*
Stwórz aplikację która odczyta plik 'output_2.txt' i wczyta z niego linię, a następniewypisze ją na ekran: 1 raz "toUpperCase", 1 raz "toLowerCase", 1 raz "trim"
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output_2.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                String toUpper = linia.toUpperCase();
                System.out.println(toUpper);
                String toLower = linia.toLowerCase();
                System.out.println(toLower);
                System.out.println(linia.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
