
package ejercicio2;

public class Gerente extends Empleado {
    
    private int diasTrabajados;
    private double pagoDia;
    
    public Gerente(int diasTrabajados, double pagoPorDia) {
        this.diasTrabajados = diasTrabajados;
        this.pagoDia = pagoPorDia;
    }
    
    @Override
    public double calcularSalario() {
        return diasTrabajados * pagoDia;
    }
}
