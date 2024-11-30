
package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(30, 300000);
        Vendedor vendedor = new Vendedor(30, 150000);
      
        System.out.println("Gerente:");
        gerente.mostrarDetalles();
        System.out.println("");
        System.out.println("Vendedor:");
        vendedor.mostrarDetalles();
    }
}
