package EJERCICIOSMETODOSMIO;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("GENERAR UN ARRAY");
        System.out.println("Dime el tamaño del array");
        int tamaño = sc.nextInt();


        int [] array = new int[tamaño];

        System.out.println("AHORA ME VAS A DECIR EL VALOR DE CADA HUECO, TIENE QUE SER ENTRE 1-10");
        int numero = 0;

        for (int i = 0;i<array.length;i++){
            do {
                System.out.println("Dime el valor del numero "+i);
                numero = sc.nextInt();
                if (numero >= 1 && numero <= 10) {
                    array[i] = numero;
                } else {
                    System.out.println("ERROR, numero introducido no esta en el rango");
                }  }while (numero < 0 || numero > 10);

        }
        System.out.println("El array compleado seria "+Arrays.toString(array));



        }




}
