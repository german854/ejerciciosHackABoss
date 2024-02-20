import java.util.Scanner;

public class ejercicio4_OperacionesLectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce otro número: ");
        double num2 = scanner.nextDouble();

        //operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("Operaciones realizadas con sus respectivos resultados: ") ;
        System.out.println("Suma: " + suma) ;
        System.out.println("Resta: " + resta) ;
        System.out.println("Multiplicación: " + multiplicacion) ;
        System.out.println("División: " + division) ;


    }
}
