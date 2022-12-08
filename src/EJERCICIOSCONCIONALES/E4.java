package EJERCICIOSCONCIONALES;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas_trabajadas;
        int horas_extras;
        int salario;
        System.out.println("Buenos dais, por favor indicame las horas que has trabajado");
        horas_trabajadas = sc.nextInt();

        if (horas_trabajadas <= 40){

            System.out.println("Esta bien, nos indicas que has trabajado " + horas_trabajadas);
            salario = horas_trabajadas * 12;
            System.out.println("Tu salario debe ser de "+salario);

        }

        else {

            horas_extras = horas_trabajadas-40;

            salario = (horas_extras * 16)+ (40*12);
            System.out.println("Tu salario es de "+salario);
        }


    }
}
