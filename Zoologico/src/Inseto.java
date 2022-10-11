
public abstract class Inseto extends Animal {

	private String corAsa;
	private int quantidadePatas;

	public Inseto(double peso, int idade, int membros, String especie, String registro, String corAsa,
			int quantidadePatas) {
		super(peso, idade, membros, especie, registro);
		this.corAsa = corAsa;
		this.quantidadePatas = quantidadePatas;
	}

	public abstract void polenizar();

	public String getCorAsa() {
		return corAsa;
	}

	public void setCorAsa(String corAsa) {
		this.corAsa = corAsa;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

}
