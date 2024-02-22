public class Electrodomestico {
    //Atributos
    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    //Constructores
    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public Electrodomestico() {
        //Constructor vacío
    }

    //Método Get
    public int getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }

    //Método Set

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
