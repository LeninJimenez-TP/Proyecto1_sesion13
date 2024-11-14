package programas;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar variables
        double ingresoMensual, otrosIngresos, gastosMensuales;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar ingreso mensual: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingresar otros ingresos: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingresar gastos mensuales: ");
        gastosMensuales = lectura.nextDouble();
        
        // Crear el objeto de la clase RegistroFinanzas con los valores ingresados
        RegistroFinanzas objRegFinanzas = new RegistroFinanzas();
        objRegFinanzas.setIngresoMensual(ingresoMensual);
        objRegFinanzas.setOtrosIngresos(otrosIngresos);
        objRegFinanzas.setGastosMensuales(gastosMensuales);
        
        // Salida de datos
        System.out.println("El ahorro mensual proyectado es: " + objRegFinanzas.getAhorroMensual());
        System.out.println("El ahorro semestral proyectado es: " + objRegFinanzas.getAhorroSemestral());
        System.out.println("El ahorro anual proyectado es: " + objRegFinanzas.getAhorroAnual());
    }
}