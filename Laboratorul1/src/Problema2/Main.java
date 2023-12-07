package Problema2;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        String numeFisier = "src/problema2/in.txt";
        File fisier = new File(numeFisier);
        Scanner scanner = new Scanner(fisier);
        int suma = 0, min = 999, max = 0, nr_numere = 0;
        float media;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int numar = scanner.nextInt();
                nr_numere++;
                suma += numar;
                if (min > numar) {
                    min = numar;
                }
                if (max < numar) {
                    max = numar;
                }
            } else {
                scanner.next();
            }
        }
        scanner.close();
        media = (float) suma / nr_numere;
        Writer writer = new FileWriter("src/problema2/out.txt");
        writer.write("Suma: "+suma);
        writer.write("\nMaximul: "+max);
        writer.write("\nMimimul: "+min);
        writer.write("\nMedia: "+media);
        writer.close();
    }
}