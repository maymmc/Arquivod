package Exercicio3;

public class Subtracao implements OperacaoMatematica {

	@Override
	public void calcular(double n1, double n2) {
		System.out.println(" O resultado de " + n1 + " + " + n2 + " = " + (n1 - n2));
	}
//sobrposiçao
	@Override
	public boolean valoresValidos(double n1, double n2) {
		//so vai fazer a conta de n1 for maior q n2
		if (n1 > n2) {
			return true;
		}
		return false;
	}

}
