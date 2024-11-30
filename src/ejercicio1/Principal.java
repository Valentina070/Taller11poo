
package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(7);
        Rectangulo rectangulo = new Rectangulo(8,5);
       //Imprimir area
        System.out.println("Círculo:");
        circulo.mostrarArea();
        System.out.println("");
        System.out.println("Rectángulo:");
        rectangulo.mostrarArea();
    }
}
