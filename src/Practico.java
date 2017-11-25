import java.util.Scanner;


public class Practico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 10;
		//paradigma estructurado tipo y variable
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba algo..");
		String ingreso = teclado.next();
		System.out.println("Hola mundo "+ingreso);
		/**
		 * Practica : funciones y procedimientos
		 */
		operacion unPractico = new operacion ();
		//Funcion
		int resultado = unPractico.suma(1, 2);
		System.out.println("El resultado de la suma como es: "+resultado);
		//Procedimiento
		unPractico.sumaSinRetorno(4,5);
		//ingreso de datos
		unPractico.restaIngreso();
		//unPractico.raizPorIngreso();
	}
	
}