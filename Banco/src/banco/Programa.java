package banco;

public class Programa {
	public static void main(String[] args) {
		ContaBanco contaBanco = new ContaBanco();
		contaBanco.abrirConta("CC");
		if (!contaBanco.sacar(200)) {
			System.out.println("Seu saldo é R$ " + contaBanco.getSaldo());
		}

	}

}
