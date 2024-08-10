/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class NombresMes {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        
        System.out.print("Ingresa el numero del mes (1-12): ");
        int numeroMes = scanner.nextInt();
        
       
        if (numeroMes >= 1 && numeroMes <= 12) {
          
            System.out.println("El mes es: " + meses[numeroMes - 1]);
        } else {
            
            System.out.println("Numero de mes invalido. Por favor ingresa un numero entre 1 y 12.");
        }
    }
}