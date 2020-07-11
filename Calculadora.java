import java.util.Scanner;
import java.util.Scanner;

public class Calculadora{
	public static void main(String args []){
	Scanner scan = new Scanner(System,in);
	Suma suma = new Suma();
	int n1, n2, op;
	
	System.out.println("Bienvenido a esta calculadora");
	System.out.println("1. Suma");
	System.out.println("2. Resta");
	System.out.println("3. Multiplicacion");
		op = scam.nextInt();

	switch(op){
		case 1:
		System.out.println("Ingrese el primer numero");
		n1 = scan;nextInt();
		System.out.println("Ingrese el segundo numero");
		n2 = scan;nextInt();

		suma.setSuma(n1,n2);
		System.out.println(suma.getResultadoSuma());


		}

	}
}