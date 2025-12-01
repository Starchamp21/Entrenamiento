package principal;
import vehiculos.Coche;

public class App {
    public static void main(String[] args) {
        Coche c1 = new Coche("Mercedes", "Indra", 125);
        Coche c2 = new Coche("Lamborghini", "IE Mechanics", 220);
        Coche c3 = new Coche("Golf", "Playtime CO", 50);
        
        c1.acelerar(69);
        System.out.println("Velocidad del coche 1 después de acelerar: " + c1.getVelocidad());

        c2.frenar(120);
        System.out.println("Velocidad del coche 2 después de frenar: " + c2.getVelocidad());

        c3.frenar(100);
        System.out.println("Velocidad del coche 3 después de frenar: " + c3.getVelocidad());
    }
}