package Lavadora;

import java.util.Scanner;

public class LavadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona 1 ROPA BLANCA //// Presiona 2 ROPA COLOR");
        int tipoderopa = sc.nextInt();

        System.out.println("Cuantos kilos de ropa?");
        int kilos = sc.nextInt();

        Lavadora mensajero = new Lavadora(kilos, tipoderopa); //TIENE QUE SER EN ESTE ORDEN, IMPORTANTE YA QUE LO PUSE AL REVES Y NO IBA
        mensajero.CicloFinalizado();

    }
}
