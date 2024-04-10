package ejercicio_2;

public class Calculadora_Avanzada extends Calculadora_Basica{

    public double modulo(double dividendo, double divisor) {
        return dividendo % divisor;
    }

    // Método para calcular la raíz cuadrada
    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    // Método para calcular la potencia
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
}
