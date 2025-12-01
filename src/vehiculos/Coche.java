package vehiculos;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidad;

    public Coche(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public Coche() {
        marca = "";
        modelo = "";
        velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) velocidad = 0; // Opcional: evita velocidad negativa.
    }

    @Override
    public String toString() {
        return "<<Coche>>\nModelo: " + modelo + "\nMarca: " + marca + "\nVelocidad: " + velocidad;
    }
}