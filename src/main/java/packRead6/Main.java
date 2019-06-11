package packRead6;

/*
Napisz aplikację która czyta plik 'output_form.txt' i która liczy statystyki:        - średni wiek kobiety,        - średni wiek mężczyzny,        - średni wiek ogólnie,        - ilość mężczyzn,        - ilość kobiet,        - proporcja ilości kobiet/mężczyzn,        - średni wzrost mężczyzn,        - średni wzrost kobiet,        - średnie zarobki mężczyzn        - średnie zarobki kobiet,        - **najczęściej udzielane odpowiedzi na poszczególne pytania (nie rozróżniaj wielkościliter
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        String linia;
        int licznik;
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("formularz.txt"))) {
            while ((linia = bufferedReader.readLine()) != null) {
                String[] tab = linia.split("=");
                list.add(tab[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String element : list) {
            System.out.print(element + ", ");
        }

        // sporządzam listę wieku kobiet
        List<Integer> listaWiekuKobiet = new ArrayList<>();
        List<String> listaWiekuString = new ArrayList<>();
        for (int i = 2; i < list.size(); i += 6) {
            if (list.get(i).equals("true")) {
                listaWiekuKobiet.add(Integer.valueOf(list.get(i - 2)));
                // listaWiekuKobiet.add(Integer.parseInt(list.get(i - 2)));
                listaWiekuString.add(list.get(i - 2));
            }
            // listaWiekuString.add(list.get(i));
        }
        // listaWiekuKobiet.forEach(System.out::println);
        // System.out.println();
        // listaWiekuString.forEach(System.out::println);

        // String liczba = "2";
        // int liczbaInt = Integer.valueOf(liczba);
        // System.out.println(liczbaInt * liczbaInt);
        // int liczbaParse = Integer.parseInt(liczba);
        // System.out.println(liczbaParse * liczbaParse);

        System.out.println();
        System.out.println();
        System.out.println("Lista wieku kobiet(Integer): ");
        for (Integer element : listaWiekuKobiet) {
            System.out.print(element + ", ");
        }

        System.out.println();
        System.out.println("Lista wieku kobiet(String): ");
        for (String element : listaWiekuString) {
            System.out.print(element + ", ");
        }
    }
}
