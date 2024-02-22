//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico(52, "Samsung", "H32W", 22, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(28, "Fagor", "Z4T2", 30, "Gris");
        Electrodomestico electrodomestico3 = new Electrodomestico(19, "Hyundai", "694Q", 47, "Negro");


        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println(" Marca: " + electrodomestico1.getMarca() + "      Modelo: " + electrodomestico1.getModelo() + "      Consumo: " + electrodomestico1.getConsumo() + "kWh");
        System.out.println(" Marca: " + electrodomestico2.getMarca() + "      Modelo: " + electrodomestico2.getModelo() + "      Consumo: " + electrodomestico2.getConsumo() + "kWh");
        System.out.println(" Marca: " + electrodomestico3.getMarca() + "      Modelo: " + electrodomestico3.getModelo() + "      Consumo: " + electrodomestico3.getConsumo() + "kWh" + "\n");

        System.out.println(" Marca: " + electrodomestico4.getMarca());

        //Al obtener la marca del electrodoméstico 4 nos apararece como nulo (null) ya que hemos intentado obtener un parámetro de un constructor vacío.
        //Tendriamos que pasarle valores a través de los métodos Get y Set.
    }
}