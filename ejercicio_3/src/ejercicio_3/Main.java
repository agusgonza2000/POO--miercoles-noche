package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        // Instanciar al menos un cuadrado, un círculo y un triángulo
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        // Almacenar las instancias en una Lista
        List<Object> formasGeometricas = new ArrayList<>();
        formasGeometricas.add(cuadrado);
        formasGeometricas.add(circulo);
        formasGeometricas.add(triangulo);

        // Iterar la lista imprimiendo en consola el perímetro y el área de cada figura
        for (Object forma : formasGeometricas) {
            if (forma instanceof Cuadrado) {
                Cuadrado c = (Cuadrado) forma;
                System.out.println("Cuadrado - Perímetro: " + c.calcularPerimetro() + ", Área: " + c.calcularArea());
            } else if (forma instanceof Circulo) {
                Circulo c = (Circulo) forma;
                System.out.println("Círculo - Perímetro: " + c.calcularPerimetro() + ", Área: " + c.calcularArea());
            } else if (forma instanceof Triangulo) {
                Triangulo t = (Triangulo) forma;
                System.out.println("Triángulo - Perímetro: " + t.calcularPerimetro() + ", Área: " + t.calcularArea());
            }
        }
    }

}
