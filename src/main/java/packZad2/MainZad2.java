package packZad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainZad2 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        File plik = new File("output_2.txt");
        try(PrintWriter printWriter = new PrintWriter(plik)){
            printWriter.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
