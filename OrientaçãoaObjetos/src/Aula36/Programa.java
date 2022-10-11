package Aula36;

public class Programa {

	public static void main(String[] args) {

		System.out.println("********* CONTA BANCÁRIA *********");
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Andreza");
		conta.setNumConta("254694");

		conta.depositar(300);

		conta.sacar(150);
		conta.sacar(70);

		System.out.println(conta);

		System.out.println();
		System.out.println("********* CONTA BANCÁRIA ESPECIAL *********");

		ChequeEspecial especial = new ChequeEspecial();
		especial.setNomeCliente("Andreza");
		especial.setNumConta("74108520");
		especial.setLimite(100);
		especial.depositar(150);
		especial.sacar(300);
		especial.getSaldo();

		System.out.println(especial);
		System.out.println();

		System.out.println("******CONTA POUPANÇA******");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Mayra");
		contaPoupanca.setNumConta("256286789588478");
		contaPoupanca.setSaldo(0);
		contaPoupanca.setDiaRendimento(9);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);

		if (contaPoupanca.calculaNovoSaldo(0.5)) {
			System.out.println("redimento aplicado,novo saldo é de = " + contaPoupanca.getSaldo());
			System.out.println(contaPoupanca);
		} else {
			System.out.println("hoje não é dia de rendimento");
		}
	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("saque efetuado, novo saldo é: " + conta.getSaldo());
		} else {
			System.out.println("saldo insuficiente para saque de = " + valor + "; saldo de = " + conta.getSaldo());

		}

	}

}
