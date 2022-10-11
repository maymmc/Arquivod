package banco;

public class ContaBanco {
	public int nunConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// METODOS
	// CC ganha 50 R$ CP ganha 150 R$
	// abrir conta somente se ela estiver ativa

	public void transferir() {

	}

	public void abrirConta(String t) {
		if (status == false) {
			this.setTipo(t); // o set ta ae pq o atributo é pq é protected ou private
			this.setStatus(true);
			if (t == "CC") { // set modifica a informação
				// BOA PRÁTICA DE SEGURANÇA trocar this.saldo = 50; para this.setSaldo(50);
				this.setSaldo(50);
				System.out.println("Você abriu uma conta corrente!");
			} else if (t == "CP") {
				this.saldo = (150);
				System.out.println("Você abriu uma conta poupança!");

			} else {
				System.out.println("Problemas na abertura da conta.");
				this.setTipo(null);
				this.setStatus(false);
			}

		} else {
			System.out.println("Não tem conta nova!");
		}
	}

	public void fecharConta() {
		if (this.status == true) {
			if (this.getSaldo() > 0) { // get só lê a informação
				System.out.println("tem dinheiro.");
			} else if (this.getSaldo() < 0) {
				System.out.println(" em débito");
			} else {
				this.setStatus(false);
				System.out.println("A conta está encerrada!");
			}
		} else {
			System.out.println("você não tem conta nesse banco!");
		}

	}

	public void depositar(double deposito) {
		if (this.status == true) {
			if (deposito > 0) {
				this.saldo += deposito;
				System.out.println("Seu depósito foi feito com sucesso!");
			} else {
				System.out.println("Valor inválido.");
			}

		} else {
			System.out.println("Não foi possível depositar, pois a conta não foi aberta!");
		}
	}

	public boolean sacar(double valor) {
		if (isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque R$" + valor);
				System.out.println(" Saldo em conta R$ " + this.getSaldo());
				return true;
			} else {
				System.out.println(" o saldo é insuficiente para saque");
				return false;
			}
		} else {
			System.out.println("impossível sacar em conta fechada");
			return false;
		}
	}

	public void pagarMensal(String tipoConta) {
		if (this.status == true) {
			int mensalidade = 0;
			if (tipoConta == "CC") {
				mensalidade = 12;
			} else {
				mensalidade = 20;
				if (!sacar(mensalidade)) {

					System.out.println("o saldo é insuficiente para pagar a mensalidade");
				} else {
					System.out.println("mensalidade paga com sucesso");
				}
			}

		}

	}

//get e set
	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}