/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class Comparaciones {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingresa el tercer numero: ");
        int numero3 = scanner.nextInt();
      
        int mayor;
        
       if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }
        
       
        System.out.println("El numero mayor es: " + mayor);
    }
}
