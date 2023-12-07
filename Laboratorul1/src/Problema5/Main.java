package Problema5;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int nr;
        nr= random.nextInt(21);
        System.out.println("Numarul generat: "+nr);
        int f1=1,f2=1,f_urm;
        f_urm=f1+f2;
        do {
            if(nr==f_urm||nr==1) {
                System.out.println("Numarul apartine sirului lui fibonacii!");
                break;
            }
            f1=f2;
            f2=f_urm;
            f_urm=f1+f2;
        }while(f_urm<=20);
    }
}