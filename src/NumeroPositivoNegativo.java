/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();
        
        
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}
