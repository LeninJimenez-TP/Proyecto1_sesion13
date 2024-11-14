package programas;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main(String[] args) {
        //declaracion de variables
        double compra1;
        double compra2;
        double compra3;
        double compra4;
        Scanner lectura = new Scanner(System.in);
        //entrtada de datos
        System.out.print("Ingresar compra 1: ");
        compra1 = lectura.nextDouble();
         System.out.print("Ingresar compra 2: ");
        compra2 = lectura.nextDouble();
         System.out.print("Ingresar compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingresar compra 3: ");
        compra4= lectura.nextDouble();
        
        
        // crear el objeto mediante la instancia de la clase
        RegistroCompra objregCompra = new RegistroCompra();
        //asignar datos a los tributos de la clase
        objregCompra.setCompra1(compra1);
        objregCompra.setCompra2(compra2);
        objregCompra.setCompra3(compra3);
        objregCompra.setCompra4(compra4);

        // Mostrar resultados
        System.out.println("Total de compras: " + objregCompra.getTotalCompra());
        System.out.println("Promedio de compras: " +objregCompra.getPromedioCompra());
        System.out.println("Compra mayor: " +objregCompra.getMayorCompra());
        System.out.println("Compra menor: " +objregCompra.getMenorCompra());
    }
}