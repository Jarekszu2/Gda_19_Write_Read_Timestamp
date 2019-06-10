package packRead2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        File file = new File("output_2.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String linia;

            while ((linia = bufferedReader.readLine()) != null) {
                String toUpper = linia.toUpperCase();
                System.out.println(toUpper);
                String toLower = linia.toLowerCase();
                System.out.println(toLower);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
