import java.util.Scanner;

public class ejercicio1EstructurasCondicionales {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >=18){
            System.out.println("Usted puede ingresar al evento. ¡Es mayor de edad!");
        }else{
            System.out.println("Usted tiene prohibido el acceso al evento. Debe ser mayor de edad.");
        }
    }
}
