
package ejercicio1;

public class Rectangulo extends Figura {
    
    private double Base;
    private double altura;
    
    public Rectangulo(double longitud, double ancho) {
        this.Base = longitud;
        this.altura = ancho;
    }
   
    @Override
    public double calcularArea() {
        return Base * altura;
    }
}
