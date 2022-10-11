package Aula36;

public class ChequeEspecial extends ContaBancaria {

	private double limite;

	@Override
	public String toString() {
		String s = "ChequeEspecial[";
		s += "nomeCliente: " + limite;
		s += ";" + super.toString();
		s += "]";
		return s;
	}

	public boolean sacar (double valor ) {
		double  saldoComLimite = this.getSaldo() + limite;
		if ((saldoComLimite-valor)>=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
