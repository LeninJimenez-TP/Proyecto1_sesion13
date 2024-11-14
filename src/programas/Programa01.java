
package programas;

import java.util.Scanner;


public class Programa01 {
    public static void main(String[] args) {
        //declaracion de variables
        double vt1,vt2,vt3;
        Scanner lectura = new Scanner(System.in);
        //entrtada de datos
        System.out.print("Ingresar venta 1: ");
        vt1 = lectura.nextDouble();
         System.out.print("Ingresar venta 2: ");
        vt2 = lectura.nextDouble();
         System.out.print("Ingresar venta 3: ");
        vt3 = lectura.nextDouble();
        // crear el objeto mediante la instancia de la clase
        RegistroVenta objregventa = new RegistroVenta();
        //asignar datos a los tributos de la clase
        objregventa.setVenta1(vt1);
        objregventa.setVenta2(vt2);
        objregventa.setVenta3(vt3);

        // Mostrar resultados
        System.out.println("Total de ventas: " + objregventa.gettotal());
        System.out.println("Promedio de ventas: " + objregventa.getpromedio());
        System.out.println("Venta mayor: " + objregventa.getmayor());
        System.out.println("Venta menor: " + objregventa.getmenor());
    }
}
