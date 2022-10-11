package Aula34;

public class Calculadora {

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;

	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;

	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;

	}

	public static int potencia(int num1, int num2) {

		int total = 1;
		for (int i = 1; i <= num2; i++) {
			total *= num1;
//			i=1;
//			total=1*2=2
//
//			i=2;
//			total=2*2=4
//
//			i=3;
//			total=4*2=8
		}

		return total;
	}

}
