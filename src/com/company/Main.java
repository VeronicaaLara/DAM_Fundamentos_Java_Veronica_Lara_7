package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir dos números y decir si uno es mayor o son iguales.

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("El número mayor es:" + numero1);
        }
        if (numero1 < numero2){
            System.out.println("El número mayor es:" + numero2);
        }
        if (numero1 ==numero2){
            System.out.println("Los números son iguales");
        }
        sc.close();
    }
}
