package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double G=9.8;
        double h;    //h=ALTURA
        double t;

        System.out.println("Por favor indica la altura");
        h = sc.nextDouble();


        //EL WHILE NO ES OBLIGATORIO PERO VEMOS QUE ES MEJOR PONERLO PARA ESTOS CASOS
        while (h<=0){
            System.out.println("Por favor la altura indica debe ser mayor a 0");
            h= sc.nextDouble();
        }
        t= Math.sqrt(2*h/G);
        System.out.println("El tiempo que tarda es "+t);


    }
}
