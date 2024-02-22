import java.util.Scanner;

public class ejercicio3ArreglosVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double sumTemperatura = 0;
        double mediaTemperaturas = 0;
        double[] vector = new double[7];
        int contador = 0;

        System.out.println("Ingresa las 7 temperaturas máximas de la última semana: ");
        while (contador < 7){
            temperatura = scanner.nextDouble();
            vector[contador] = temperatura;
            contador++;
        }
        for (int i=0; i<vector.length; i++) {

            sumTemperatura += vector[i];

            mediaTemperaturas = sumTemperatura/vector.length;

        }

        System.out.println("La media de las temperaturas de ésta semana ha sido: " + mediaTemperaturas);

    }
}
