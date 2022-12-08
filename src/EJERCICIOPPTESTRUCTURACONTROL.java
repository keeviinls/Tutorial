import java.util.Scanner;

public class EJERCICIOPPTESTRUCTURACONTROL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int año_nacimiento;
        do {
        System.out.println("Por favor introduce tu edad, debe ser mayor a 0");
        edad = sc.nextInt();
        año_nacimiento= 2022 - edad;

        if (edad > 0) {
            System.out.println("Tu año de nacimiento es " + año_nacimiento);


            if (año_nacimiento >= 1930 && año_nacimiento <= 1948) {

                System.out.println("Silent Generation");
            } else if (año_nacimiento >= 1949 && año_nacimiento <= 1968) {
                System.out.println("Baby room");

            } else if (año_nacimiento >= 1969 && año_nacimiento <= 1980) {
                System.out.println("Generacion X");

            } else if (año_nacimiento >= 1981 && año_nacimiento <= 1993) {
                System.out.println("Generacion Y");

            } else if (año_nacimiento >= 1994 && año_nacimiento <= 2010) {
                System.out.println("Generacion Z");

            }
        }
        else {
            System.out.println("has puesto una edad incorrecta");
        }
        }

        while (edad <= 0);


    }
}
