
package ejercicio3;

public class Gerente extends Empleado {
    
  
    private int diasTrabajados;
    private double pagoPorDia;
    
    public Gerente(int diasTrabajados, double pagoPorDia) {
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSalario() {
        return diasTrabajados * pagoPorDia;
    }
   
    @Override
    public void mostrarDetalles() {
        System.out.println("El salario del gerente es: " + calcularSalario());
    }
}
