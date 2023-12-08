package exercitiul1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file = new File("src/main/resources/OUTAngajati.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Angajat> citire() {
        try {
            File file = new File("src/main/resources/angajati.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<Angajat> angajati = mapper
                    .readValue(file, new TypeReference<List<Angajat>>() {
                    });
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void afisare(List<Angajat> lista) {
        for (var ang : lista) {
            System.out.println(ang);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int optiune = 0;
        List<Angajat> lista_angajati = citire();

        do {
            System.out.println("\n\n\nAlege optiune:");
            System.out.println("0.Exit");
            System.out.println("1.Afisare");
            System.out.println("2.Salar > 2500 RON");
            System.out.println("3.Angajati Aprilie anu precedent");
            System.out.println("4.Angajati cu fct de conducere");
            System.out.println("5.Nume angajati cu CAPS");
            System.out.println("6.Afisare salarii mai mici de 3000 de RON");
            System.out.println("7.Afisare date ale primului angajat");
            System.out.println("8.Statistici salarii (min, mid, max)");
            System.out.println("9.Exista Ion ?");
            System.out.println("10.Persoane angajate vara an trecut");

            System.out.print("Optiunea dorita este: ");
            optiune = scanner.nextInt();

            System.out.println("\n");

            switch (optiune) {
                case 1:
                    afisare(lista_angajati);
                    break;
                case 2:
//                    for(var ang : lista_angajati) {
//                        if(ang.getSalariu() > 2500) {
//                            System.out.println(ang);
//                        }
//                    }
                    lista_angajati.stream()
                            .filter(ang -> ang.getSalariu() > 2500)
                            .forEach(System.out::println);
                    break;
                default:
                    System.out.println("Nu exista optiunea alease");
                    break;
            }

        } while (optiune != 0);


    }
}