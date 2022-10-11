
public abstract class Animal {

	private double peso;
	private int idade;
	private int membros;
	private String especie;
	private String registro;

	public Animal(double peso, int idade, int membros, String especie, String registro) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
		this.especie = especie;
		this.registro = registro;
	}

	public abstract void locomover();

	public abstract void alimentar();

	public abstract void emitirSom();

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
}
