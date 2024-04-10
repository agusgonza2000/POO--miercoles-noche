package ejercicio_1;

public class Calculadora {
    // Método para sumar dos números
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Método para restar dos números
    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Método para multiplicar dos números
    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Método para dividir dos números
    public static double dividir(double dividendo, double divisor) {
        // Verificamos si el divisor es cero para evitar una división por cero
        if (divisor != 0) {
            return dividendo / divisor;
        } else {
            // En caso de que el divisor sea cero, retornamos un valor especial, por ejemplo, NaN (Not a Number)
            return Double.NaN;
        }
    }
}
