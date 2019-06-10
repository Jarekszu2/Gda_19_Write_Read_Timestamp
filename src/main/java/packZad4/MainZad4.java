package packZad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainZad4 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        File file = new File("output_4.txt");
        String text = "";

        try(PrintWriter printWriter = new PrintWriter(file)) {
            text = scanner.nextLine();
            printWriter.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } ;

        System.out.println("Czy plik istnieje" + file.exists());
    }
}
