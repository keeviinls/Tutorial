package EJERCICIOSBUCLE;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 100;

        System.out.println("Vamos a mostrar por pantalla todos los multiplos del 5");

        for (int i=0;i<=MAX;i++){

            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
