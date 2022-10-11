
public class Canguru extends Mamifero {

	private boolean utero;

	public Canguru(double peso, int idade, int membros, String especie, String registro, int qtdadesglandulasMamarias,
			String pelo, boolean utero) {
		super(peso, idade, membros, especie, registro, qtdadesglandulasMamarias, pelo);
		this.utero = utero;
	}

	public void usarBolsa() {
		System.out.println(" usa uma bolsa chamada marsúpio");
	}

	@Override
	public void locomover() {
		System.out.println("se locomove pulando");
	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta de plantas e fungos");
	}

	@Override
	public void emitirSom() {
		System.out.println("seu som é TATATATA");

	}

	public boolean isUtero() {
		return utero;
	}

	public void setUtero(boolean utero) {
		this.utero = utero;
	}

}
