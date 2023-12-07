package Problema4;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int nr1, nr2;
        Random random = new Random();
        nr1= random.nextInt(31);
        nr2= random.nextInt(31);
        System.out.println("Numarul 1: "+nr1+"\nNumarul 2: "+nr2);
        System.out.println("CMMDC-ul: "+CMMDC(nr1,nr2));
    }
    public static int CMMDC(int a, int b)
    {
        while(a!=b) {
            if (a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
}