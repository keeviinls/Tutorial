package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escribe un numero");
        numero = sc.nextInt();

        switch (numero){

            case 1: {
                System.out.println("Enero");break;
            }

            case 2: {
                System.out.println("Febrero");break;
            }

            case 3: {
                System.out.println("Marzo");break;
            }

            default:
                System.out.println("pusiste mal papa");break;

        }


    }
}
