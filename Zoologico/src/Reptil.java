
public abstract class Reptil extends Animal {

	private String corEscama;

	public Reptil(double peso, int idade, int membros, String especie, String registro, String corEscama) {
		super(peso, idade, membros, especie, registro);
		this.corEscama = corEscama;
	}

	public abstract void trocaPele();

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
