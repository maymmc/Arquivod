package Aula34;

public class Exer02 {
	public static void main(String[] args) {

		imprimirTela(Calculadora.dividir(10, 2));
		imprimirTela(Calculadora.multiplicar(2, 3));
		imprimirTela(Calculadora.subtrair(10, 2));
		imprimirTela(Calculadora.somar(10, 2));
		imprimirTela(Calculadora.potencia(2, 3));

	}

	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
