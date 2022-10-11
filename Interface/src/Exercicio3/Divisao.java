package Exercicio3;

public class Divisao implements OperacaoMatematica {

	@Override
	public void calcular(double n1, double n2) {
		System.out.println(" O resultado de " + n1 + " + " + n2 + " = " + (n1 / n2));

	}

	public boolean valoresValidos(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("Divisão nao aceita 0 no denominador");
			return false;
		}
		return true;
	}

}