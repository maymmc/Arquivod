
public abstract class Ave extends Animal {

	private String CorPena;

	public Ave(double peso, int idade, int membros, String especie, String registro, String corPena) {
		super(peso, idade, membros, especie, registro);
		CorPena = corPena;

	}

	public abstract void fazerNinho();

	public String getCorPena() {
		return CorPena;
	}

	public void setCorPena(String corPena) {
		CorPena = corPena;
	}

}
