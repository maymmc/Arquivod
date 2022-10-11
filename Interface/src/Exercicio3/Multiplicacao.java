package Exercicio3;

public class Multiplicacao implements OperacaoMatematica {
//sobreposiçao
	@Override
	public void calcular(double n1, double n2) {
		System.out.println(" O resultado de " + n1 + " + " + n2 + " = " + (n1 * n2));

	}

	public boolean valoresValidos(double n1, double n2) {
		if (n1 == 0 && n2 == 0) {
			System.out.println("Multiplicação nao aceita 0 nos multiplicadores");
			return false;
		}
		return true;
	}

}