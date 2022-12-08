package EJERCICIOSMETODOSMIO;

import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        int numero = 0;
        primo(numero);

    }


    public static void primo (int numero){
        Scanner sc = new Scanner(System.in);

        do {


        System.out.println("Por favor escribe un numero");
        numero = sc.nextInt();

        System.out.println("Ok, el numero que has escogido es "+numero);


        if (numero%2==0){
            System.out.println("El numero que has escogido es par");
        }

        else{
            System.out.println("El numero es impar");
        }
    }
        while (numero < 0);
    }
}
