import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona personas[] = new Persona[5];

        personas[0] = new Persona(1, "Antonio", 56, "Calle Magnolios 5", 123456789);
        personas[1] = new Persona(2, "Pepe", 33, "Calle Pajaritos 11", 321457897);
        personas[2] = new Persona(3, "María", 20, "Calle Nueva Andalucia 3", 987654321);
        personas[3] = new Persona(4, "Patricia", 30, "Calle Federico 6", 564123789);
        personas[4] = new Persona(5, "Juan", 12, "Calle Real 2", 369258147);


        //Mostrar por pantalla todas las personas y su edad
        for(int i=0; i< personas.length; i++){
            System.out.println(personas[i].getNombre() + ".   Edad: " + personas[i].getEdad());
        }

        //Cambiar el nombre de dos personas
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nCambia el nombre de 2 personas:");
        for(int i=0; i< 2; i++){
            personas[i].setNombre(scanner.nextLine());
            System.out.println(personas[i].getNombre() + ".   Edad: " + personas[i].getEdad());
        }

        //Mostrar por pantalla las personas que tienen más de 30 años
        System.out.println("\n \nLas personas que tienen más de 30 años son: ");
        for(int i=0; i< personas.length; i++){
            if(personas[i].getEdad()>30){
            System.out.println(personas[i].getNombre() + ".   Edad: " + personas[i].getEdad());
            }
        }




    }
}