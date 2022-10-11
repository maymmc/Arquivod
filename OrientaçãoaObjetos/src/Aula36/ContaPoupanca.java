package Aula36;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public void calcularNovoSaldo() {

	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento +  super.toString();
	}

	public boolean calculaNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();

		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			// saldo = saldo + saldo * taxaRendimento;
			this.setSaldo(this.getDiaRendimento() + this.getSaldo() * taxaRendimento);
			return true;

		}
		return false;

	}

}
