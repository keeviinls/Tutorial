package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.println("Primera nota");
        nota1=sc.nextDouble();
        System.out.println("Segunda nota");
        nota2=sc.nextDouble();
        System.out.println("Tercera nota");
        nota3=sc.nextDouble();

        media= (nota1+nota2+nota3)/3;

        System.out.println("La media es de " +media);


    }
}
