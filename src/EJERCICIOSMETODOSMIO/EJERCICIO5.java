package EJERCICIOSMETODOSMIO;

import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos euros quieres cambiar");
        double euros = sc.nextDouble();
        System.out.println("OK, ENTONCES QUIERES CAMBIAR  "+euros+"€");
        System.out.println("A que moneda quieres cambiar?");
        String cambio = sc.next().toLowerCase();
        System.out.println("Serian un total de "+transformar(euros,cambio));

    }

    public static double transformar (double euros, String cambio){
        double resultado = 0;
        final double DOLAR=1.25;   //LAS CONSTANTES VAN SIEMPRE EN MAYUSCULAS
        final double LIBRA=0.86;
        final double YENES=129.852;

        switch (cambio){

            case "libras":{
                resultado = euros * LIBRA;break;
            }
            case "dolares":{
                resultado = euros * DOLAR;break;
            }
            case "yenes":{
                resultado = euros * YENES;break;
            }
        }

        return resultado;
    }
}
