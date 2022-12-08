package EJERCICIOSMETODOSMIO;

import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double exponente;
        double solucion;

        do {


        System.out.println("Dime la base");
        base = sc.nextDouble();
        System.out.println("Dime el exponente");
        exponente=sc.nextDouble();
        potencia(base,exponente);
    }while (base < 0 || exponente <0);


    }

    public static void potencia(double base, double exponente){
        double resultado = 0;

        if (base >= 0 && exponente >= 0){
        resultado = Math.pow(base,exponente);
            System.out.println("El resultado es   "+resultado);

        }

        else {
            System.out.println("Has escrito numeros incorrectos, vuelve a intentarlo");
        }

    }
}
