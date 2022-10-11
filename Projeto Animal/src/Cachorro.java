
public class Cachorro extends Lobo {

	public Cachorro(double peso, int idade, int membros, String corDePelo) {
		super(peso, idade, membros, corDePelo);
		// TODO Auto-generated constructor stub
	}

	@Override // - SOBREPOSICAO
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("AU AU AU");
	}

	public void enterrarOsso() {
		System.out.println("enterrando osso");

	}

	public void abanarRabo() {
		System.out.println(" abanando rabo");
	}

	// SOBRECARGA - SEMPRE NA MESMA CLASSE E SEMPRE VAI TER A ASSINATURAS DIFERENTES
	public void reagir(String frase) {
		if (frase == "toma comida" || frase == "olá") {
			System.out.println("abanar e latir");
		} else {
			System.out.println("rosnar");
		}
	}

	public void reagir(int hora, int minuto) {
		if (hora < 12) {
			System.out.println("abanar");
			// se nao se
		} else if (hora >= 18) {
			System.out.println("ignorar");
		} else {
			System.out.println("abanar e latir");
		}
	}

//	public void reagir() {
//
//	}
//
//	public void reagir() {
//
//	}
}
