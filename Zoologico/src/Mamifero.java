
public abstract class Mamifero extends Animal {

	private int qtdadesglandulasMamarias;
	private String corPelo;

	public Mamifero(double peso, int idade, int membros, String especie, String registro, int qtdadesglandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, registro);
		this.qtdadesglandulasMamarias = qtdadesglandulasMamarias;
		this.corPelo = corPelo;
	}

	public int getQtdadesglandulasMamarias() {
		return qtdadesglandulasMamarias;
	}

	public void setQtdadesglandulasMamarias(int qtdadesglandulasMamarias) {
		this.qtdadesglandulasMamarias = qtdadesglandulasMamarias;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}