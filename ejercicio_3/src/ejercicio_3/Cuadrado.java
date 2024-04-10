package ejercicio_3;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
