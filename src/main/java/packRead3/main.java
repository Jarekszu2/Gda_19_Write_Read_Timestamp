package packRead3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        System.out.println();

        int licznikLinii = 0;
        int licznikSlow = 0;
        String linia;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output_2.txt"))) {
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
                String[] slowa = linia.split(" ");
                licznikLinii++;
                licznikSlow += slowa.length;
            }
            System.out.println("Ilość słów: " + licznikSlow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
