package packZad5_Formularz;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainFormularz {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Formularz formularz = new Formularz();

        System.out.println("Wiek?");
        formularz.setWiek(scanner.nextInt());

        System.out.println("Wzrost?");
        formularz.setWzrost(scanner.nextInt());

        System.out.println("Czy jesteś kobietą?");
        formularz.setCzyKobieta(scanner.nextBoolean());

        System.out.println("Zarobki?");
        formularz.setZarobki(scanner.nextInt());

        System.out.println("Czy masz psa?");
        formularz.setCzyMaPsa(scanner.nextBoolean());

        System.out.println("Numer buta?");
        formularz.setRozmiarButa(scanner.nextInt());


        System.out.println();
        System.out.println(formularz);

        System.out.println();
        System.out.println(formularz.zwrocWFormacie());

        try(PrintWriter printWriter = new PrintWriter(new FileWriter("formularz.txt", true))) {
            printWriter.println(formularz.zwrocWFormacie());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
