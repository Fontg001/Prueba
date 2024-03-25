/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionprueba;

import java.util.Scanner;

/**
 *
 * @author 54386
 */
public class SumadeNumeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        //int suma = numero1 + numero2;

        System.out.println("La suma de los números es: " + numero1 + numero2);
    }    
}
