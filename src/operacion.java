import java.util.Scanner;


public class operacion {
//ejemplo de funcion
public int suma (int op1, int op2){
	return op1+op2;
}

//ejemplo de procedimiento
	public void sumaSinRetorno(int op1, int op2){
		int resu = op1 + op2;
		System.out.println("El resultado de la suma es: "+ resu);
	}
	public void restaIngreso(){
		int resultado;
		int op1,op2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese primer valor");
		op1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor");
		op2= teclado.nextInt();
		resultado= op1-op2;
		System.out.println("El resultado es: "+ resultado);
		teclado.close();
		
	}
	public float raizCuadrada(float radicando){
		return (float)Math.sqrt (radicando);
	}
	//public void raizPorIngreso (){
		//float res;
		//float radicando;
		//Scanner teclado = new Scanner (System.in);
	//	System.out.println("Ingrese el radicando ");
		//radicando = teclado.nextFloat();
//		res = (float)Math.sqrt(radicando); 
	//	System.out.println("El resultado es:  "+res);
		//teclado.close();
//	}
}