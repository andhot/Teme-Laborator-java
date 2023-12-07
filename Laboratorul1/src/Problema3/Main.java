package Problema3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numar, nr_div=0;
        System.out.println("Dati numarul: ");
        numar = scanner.nextInt();
        System.out.println("1");
        int divizor=2;
        while(divizor<=numar/2)
        {
            if(numar%divizor==0) {
                System.out.println(divizor);
                nr_div++;
            }
            divizor++;
        }
        System.out.println(numar);
        if(nr_div == 0)
            System.out.println("Numarul este prim!");
    }
}