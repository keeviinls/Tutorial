package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        do {
            System.out.println("PRIMERA NOTA");
            nota1=sc.nextDouble();
            if (nota1 < 0){
                System.out.println("Has introducido una nota no valida");
            }
        }

        while (nota1<0);

        do {
            System.out.println("SEGUNDA  NOTA");
            nota2=sc.nextDouble();
            if (nota2 < 0){
                System.out.println("Has introducido una nota no valida");
            }
        }

        while (nota2<0);

        do {
            System.out.println("TERCERA NOTA");
            nota3=sc.nextDouble();
            if (nota2 < 0){
                System.out.println("Has introducido una nota no valida");
            }
        }

        while (nota3<0);

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 0 && media < 5){
            System.out.println("tu nota media es de "+media);
            System.out.println("Por lo que tienes un SUSPENSO");
        }

        else if (media >= 5 && media < 7){
            System.out.println("tu nota media es de "+media);
            System.out.println("Por lo que tienes un BIEN");
        }

        else if (media >= 7 && media < 9){
            System.out.println("tu nota media es de "+media);
            System.out.println("Por lo que tienes un NOTABLE");
        }

        else if (media >= 9 && media < 10){
            System.out.println("tu nota media es de "+media);
            System.out.println("Por lo que tienes un SOBRESALIENTE");
        }
    }
}
