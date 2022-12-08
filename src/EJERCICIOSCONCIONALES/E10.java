package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        String mes = "";
        do{



        System.out.println("Por favor, dime en que mes naciste");
        mes = sc.next();
        mes=mes.toLowerCase();


        switch (mes){

            case "enero": {
                do{

                    System.out.println("Por favor indica el dia en que naciste");
                    dia = sc.nextInt();
                    if (dia <= 19 && dia > 0) {
                        System.out.println("CAPRICORNIO");
                    }
                    else if (dia > 20 && dia <=31) {
                        System.out.println("ACUARIO");
                        System.out.println("Has introducido un dia no valido");
                        }


                 }
                while (dia>31 || dia<0) ;
                break;

            }



            default:
                System.out.println("No has introducido un mes, por favor vuelve a intentarlo");break;

        }

    }
        while (mes != "");





        }




    }

