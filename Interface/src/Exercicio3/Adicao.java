package Exercicio3;

public class Adicao implements OperacaoMatematica {

	@Override
	public void calcular(double n1, double n2) {
		System.out.println(" O resultado de " + n1 + " + " + n2 + " = " + (n1 + n2));
	}

	@Override
	public boolean valoresValidos(double n1, double n2) {
		if (n1 == n2) {
			System.out.println("Ambos os números não podem ser iguais");
			return false;
		}
		return true;

		// return (n1 + n2);

	}

}
