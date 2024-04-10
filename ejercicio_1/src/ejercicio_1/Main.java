package ejercicio_1;

public class Main {

	public static void main(String[] args) {
        // Probamos los métodos de la Calculadora
        double resultadoSuma = Calculadora.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        double resultadoResta = Calculadora.restar(5, 3);
        System.out.println("Resta: " + resultadoResta);

        double resultadoMultiplicacion = Calculadora.multiplicar(5, 3);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = Calculadora.dividir(6, 3);
        System.out.println("División: " + resultadoDivision);
	
	}
}


