package Problema1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        float lungime, latime, perimetru, arie;
        System.out.println("Dati lungimea: ");
        lungime= scanner.nextFloat();
        System.out.println("Dati latimea: ");
        latime = scanner.nextFloat();
        perimetru = 2*(lungime+latime);
        arie = lungime*latime;
        System.out.println("Perimetrul este: "+perimetru+"\nAria este: "+arie);
    }
}