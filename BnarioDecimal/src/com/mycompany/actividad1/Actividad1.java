package com.mycompany.actividad1;
import  java.util.Scanner;
public class Actividad1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
         System.out.print("Ingrese un número binario de 16 dígitos: ");
        String bin = sc.nextLine();
        
        if (bin.length() != 16) {
            System.out.println("El número binario tiene quie tener 16 dígitos.");
        }
        
        // Convirtiendo de binario a decimal
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Decimal: " + decimal);
        
        // Convirtiendo de decimal a octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
        
        // Convirtiendo dedecimal a hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
    }
}