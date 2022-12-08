package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        //ME FALTO COMO USAR LOWERCASE
        Scanner sc = new Scanner(System.in);
        String dia = "";
        System.out.println("Escribe un numero que corresponda a un dia");
        dia = sc.next();
        dia=dia.toLowerCase();

        switch (dia){

            case "lunes": {
                System.out.println("Matematicas");break;
            }

            case "martes": {
                System.out.println("Ingles");break;
            }

            case "miercoles": {
                System.out.println("Ciencias");break;
            }

            default:
                System.out.println("pusiste mal papa");break;

        }
    }
}
