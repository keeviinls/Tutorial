package EJERCICIOSBUCLE;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=1;
        int b=2;
        int c=3;
        int d=4;

        int e,f,g,h=0;

        for (int i=0;i<4;i++){

            System.out.println("PRIMER DIGITO");
            e= sc.nextInt();
            System.out.println("SEGUNDO DIGITO");
            f= sc.nextInt();
            System.out.println("TERCER DIGITO");
            g= sc.nextInt();
            System.out.println("CUARTO DIGITO");
            h= sc.nextInt();

            if (e == a && f == b && g == c && h == d){
                System.out.println("FELICIDAES, CONTRASEÑA CORRECTA");
                System.exit(1);

            }
            else {
                System.out.println("CODIGO INCORRECTO");
            }
        }

        System.out.println("INTENTOS AGOTADOS");

    }
}
