package EJERCICIOSMETODOSMIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        System.out.println("Escribe un texto");
        texto = sc.next();
        System.out.println("LA LONGITUD DEL TEXTO ES    "+Longitud(texto));
        System.out.println("LA INICIAL DEL TEXTO ES    "+Inicial(texto));
        System.out.println("LA ULTIMA LETRA DE LA PALABRA ES    "+Ultima(texto));
        System.out.println("SI QUITAMOS ESPACIO EN LA PALABRA SERIA "+Quitar(texto));
        System.out.println("LA PALABRA EN MAYUSCULAS ES " +Mayuscula(texto));
        System.out.println("LA PALABRA EN MINUSCULAS ES " +Minuscula(texto));
        System.out.println("AHORA PASAREMOS A REEMPLAZAR UNA LETRA POR OTRA");
        System.out.println("LA NUEVA PALABRA SERIA   " +Reemplazar(texto));
        System.out.println("LA PALABRA ESTA VACIA??   "+Vacio(texto));
        System.out.println("LA PALABRA EN ARRAY SERIA "+Arrays.toString(array(texto)));

    }


    private static char [] array(String texto){

        char [] array;
        array=texto.toCharArray();
        return array;

    }

    private static boolean Vacio(String texto){
        boolean resultado;
        resultado=texto.isEmpty();
        return resultado;

    }


    private static String Reemplazar(String texto){
        Scanner sc = new Scanner(System.in);
        String resultado="";
        char letra_reemplazar;
        char letra_nueva;

        System.out.println("DIME QUE LETRA QUIERES REEMPLAZAR");
        letra_reemplazar = sc.next().charAt(0);
        System.out.println("DIME QUE LETRA QUIERES PONER");
        letra_nueva = sc.next().charAt(0);

        resultado = texto.replace(letra_reemplazar,letra_nueva);
        return resultado;
    }



    private static String Minuscula(String texto) {
        String resultado = "";

        resultado=texto.toLowerCase();

        return resultado;
    }

    public static String Mayuscula (String texto){
        String resultado="";

        resultado=texto.toUpperCase();

        return resultado;
    }

    public static String Quitar (String texto){
        String resultado="";

        resultado=texto.trim();

        return resultado;
    }


    public static char Ultima(String texto){
        char resultado;

        resultado=texto.charAt(texto.length()-1);

        return resultado;
    }

    public static char Inicial(String texto){
        char resultado;

        resultado=texto.charAt(0);

        return resultado;
    }

    public static int Longitud (String texto){
        int resultado;
        resultado=texto.length();
        return resultado;
    }
}
