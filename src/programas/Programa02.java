package programas;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        double sueldo1, sueldo2, sueldo3, sueldo4;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingresar sueldo 4: ");
        sueldo4 = lectura.nextDouble();
        // crear el objeto mediante la instancia de la clase
        Empleado objempleado = new Empleado();
        objempleado.setSueldo1(sueldo1);
        objempleado.setSueldo2(sueldo2);
        objempleado.setSueldo3(sueldo3);
        objempleado.setSueldo4(sueldo4);

        System.out.println("Total de sueldos: " + objempleado.getTotalsueldo());
        System.out.println("Promedio de sueldos: " + objempleado.getPromediosueldo());
        System.out.println("Sueldo mayor: " + objempleado.getMayorsueldo());
        System.out.println("Sueldo menor: " + objempleado.getMenorsueldo());
    }
}