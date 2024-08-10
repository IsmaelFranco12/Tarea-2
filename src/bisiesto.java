/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa un anio: ");
        int anio = scanner.nextInt();
        
       
        boolean esBisiesto;
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }
        
      
        if (esBisiesto) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
}
