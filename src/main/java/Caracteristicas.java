
public class Caracteristicas {
    //Atributos
    String marca;
    String modelo;
    double precio;

    public Caracteristicas(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String MostrarDatos() {
        return "Caracteristicas{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

}
