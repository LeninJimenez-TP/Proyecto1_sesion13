package programas;

public class RegistroFinanzas {
    // Atributos de la clase
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Métodos para establecer y obtener los valores de los atributos
    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    // Métodos para calcular el ahorro mensual, semestral y anual
    public double getAhorroMensual() {
        return ingresoMensual + otrosIngresos - gastosMensuales;
    }

    public double getAhorroSemestral() {
        return getAhorroMensual() * 6;
    }

    public double getAhorroAnual() {
        return getAhorroMensual() * 12;
    }
}