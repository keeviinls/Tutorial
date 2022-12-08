package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hora;
        System.out.println("Escribe una hora");
        hora = sc.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos dias");
        }
        else if (hora >= 13 && hora <=20) {
            System.out.println("Buenas tardes");
        }

        else if (hora >24) {
            System.out.println("Has introducido un valor incorrecto");
        }

        else {
            System.out.println("Buenas noches");
        }


    }
}
