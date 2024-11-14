package programas;

public class Empleado {
    // Atributos de la clase
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // Métodos de acceso

    public double getSueldo1() {
        return sueldo1;
    }

    public void setSueldo1(double sueldo1) {
        this.sueldo1 = sueldo1;
    }

    public double getSueldo2() {
        return sueldo2;
    }

    public void setSueldo2(double sueldo2) {
        this.sueldo2 = sueldo2;
    }

    public double getSueldo3() {
        return sueldo3;
    }

    public void setSueldo3(double sueldo3) {
        this.sueldo3 = sueldo3;
    }

    public double getSueldo4() {
        return sueldo4;
    }

    public void setSueldo4(double sueldo4) {
        this.sueldo4 = sueldo4;
    }

    public double getTotalsueldo() {
        return(this.getSueldo1()+this.getSueldo2()+this.getSueldo3()+this.getSueldo4());
    }

    public double getPromediosueldo() {
        return this.getTotalsueldo() / 4;
    }

    public double getMayorsueldo() {
        double mayor;
        mayor=this.getSueldo1();
        if (this.getSueldo2()< mayor) {
            mayor = this.getSueldo2();
        }
        if (this.getSueldo2()<mayor) {
            mayor=this.getSueldo3();
        }
        if (this.getSueldo4()<mayor) {
            mayor=this.getSueldo4();
        }
        return (mayor);
    }

    public double getMenorsueldo() {
        double menor;
        menor=this.getSueldo1();
        if (this.getSueldo2()> menor) {
            menor = this.getSueldo2();
        }
        if (this.getSueldo2()>menor) {
            menor=this.getSueldo3();
        }
        if (this.getSueldo4()>menor) {
            menor=this.getSueldo4();
        }
        return (menor);
    }
}