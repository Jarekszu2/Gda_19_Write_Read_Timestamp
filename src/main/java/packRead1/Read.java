package packRead1;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        System.out.println();

        File file = new File("output_2.txt");
        boolean czyIstnieje = file.exists();
        System.out.println(czyIstnieje);

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String linia;

            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }
//            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
