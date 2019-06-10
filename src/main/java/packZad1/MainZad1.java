package packZad1;

/*
Zapis1​. Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego "Hello World!" anastępnie zamyka plik.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainZad1 {
    public static void main(String[] args) {
        System.out.println();

        try(PrintWriter printWriter= new PrintWriter(new FileWriter("output_1.txt"))) {
            printWriter.println("Hallo World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
