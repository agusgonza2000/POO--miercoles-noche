package ejercicio_2;

public class Main {

	public static void main(String[] args) {
	Calculadora_Avanzada miCalculadoraAvanzada = new Calculadora_Avanzada();
        
    // Realizar operaciones avanzadas
    double resultadoSuma = miCalculadoraAvanzada.sumar(5, 3);
    System.out.println("Suma Avanzada: " + resultadoSuma);
    double resultadoResta = miCalculadoraAvanzada.restar(5, 3);
    System.out.println("Resta Avanzada: " + resultadoResta);
    double resultadoMultiplicacion = miCalculadoraAvanzada.multiplicar(5, 3);
    System.out.println("Multiplicación Avanzada: " + resultadoMultiplicacion);
    double resultadoDivision = miCalculadoraAvanzada.dividir(6, 3);
    System.out.println("División Avanzada: " + resultadoDivision);
    double resultadoModulo = miCalculadoraAvanzada.modulo(7, 3);
    System.out.println("Módulo Avanzada: " + resultadoModulo);
    double resultadoRaiz = miCalculadoraAvanzada.raizCuadrada(9);
    System.out.println("Raíz cuadrada Avanzada: " + resultadoRaiz);
    double resultadoPotencia = miCalculadoraAvanzada.potencia(2, 3);
    System.out.println("Potencia Avanzada: " + resultadoPotencia);
        
    // Crear una calculadora simple
    Calculadora_Basica miCalculadoraSimple = new Calculadora_Basica();
        
    // Realizar operaciones simples
    double resultadoSumaSimple = miCalculadoraSimple.sumar(5, 3);
    System.out.println("Suma Simple: " + resultadoSumaSimple);
    double resultadoRestaSimple = miCalculadoraSimple.restar(5, 3);
    System.out.println("Resta Simple: " + resultadoRestaSimple);
    double resultadoMultiplicacionSimple = miCalculadoraSimple.multiplicar(5, 3);
    System.out.println("Multiplicación Simple: " + resultadoMultiplicacionSimple);
    double resultadoDivisionSimple = miCalculadoraSimple.dividir(6, 3);
    System.out.println("División Simple: " + resultadoDivisionSimple);
        
	}

}
