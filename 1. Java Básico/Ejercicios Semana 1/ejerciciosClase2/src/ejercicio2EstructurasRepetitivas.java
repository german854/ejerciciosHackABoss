import java.util.Scanner;

public class ejercicio2EstructurasRepetitivas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioProducto;
        int numProducto = 1;
        double sumProducto = 0;


        System.out.println("Introducir precios de los productos:     (Para finalizar introduce 0)");
        System.out.println("Producto " + numProducto++); precioProducto = scanner.nextDouble();

        while (precioProducto > 0){
            sumProducto += precioProducto;
            System.out.println("Su cuenta es de: " + sumProducto + " euros");

            System.out.println("Producto " + numProducto++);
            precioProducto = scanner.nextDouble();

        }
        System.out.println("SU CUENTA FINAL ES DE: " + sumProducto + " EUROS");


    }
}
