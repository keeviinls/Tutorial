package EJERCICIOSMETODOSMIO;

import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion = "";
        int repetir = 0;
        System.out.println("Bienvenido escoge una opcion");


        System.out.println("Circulo");
        System.out.println("Triangulo");
        System.out.println("Cuadrado");
        opcion = sc.next();
        opcion=opcion.toLowerCase();
        switch (opcion){
            case "circulo":{
                System.out.println("Elegiste ciruclo");
                System.out.println("DIME EL VALOR DEL RADIO");
                double radio = sc.nextDouble();
                System.out.println("El area del circulo es "+circulo(radio));
                break;
            }
            case "triangulo":{
                System.out.println("Elegiste ciruclo");
                System.out.println("DIME LA BASE DEL TRAINGULO");
                double base = sc.nextDouble();
                System.out.println("DIME LA ALTURA DEL TRAINGULO");
                double altura = sc.nextDouble();
                System.out.println("El area del triangulo es de "+triangulo(base,altura));break;

            }
            case "cuadrado":{
                System.out.println("Elegiste cuadrado");
                System.out.println("DIME EL LADO DEL CUADRADO");
                double lado = sc.nextDouble();
                System.out.println("El area del cuadrado es "+cuadrado(lado));break;
            }
            default:{
                System.out.println("Has escogido un numero erroneo");break;

            }
        }
        ;

    }

    public static double cuadrado (double lado){
        double resultado;

        resultado=lado*lado;

        return resultado;
    }

    public static double triangulo(double base, double altura){
        double resultado;

        resultado = (base*altura)/2;

        return resultado;
    }

    public static double circulo(double radio) {
        double resultado;

        resultado=Math.pow(radio,2)*Math.PI;

        return resultado;
    }
}
