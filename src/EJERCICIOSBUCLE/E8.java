package EJERCICIOSBUCLE;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Dino un numero y te mostraremos su tabla de multiplicar");
        numero = sc.nextInt();

        for (int i=0;i<=10;i++){

            int resultado=numero*i;
            System.out.println(+numero+ " multiplicado por "+i+" es igual a "+ resultado);


        }
    }
}
