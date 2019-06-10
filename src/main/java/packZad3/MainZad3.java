package packZad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 Należy napisać aplikację która w pętli while czyta ze Scannera wejście użytkownika zkonsoli, a następnie linia po linii wypisuje tekst do pliku 'output_3.txt'. Aplikacja ma sięzamykać po wpisaniu przez użytkownika komendy "quit"
 */
public class MainZad3 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String text = "";
        File file = new File("output_3.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            while (!text.equals("quit")) {
                text = scanner.nextLine();
                printWriter.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
