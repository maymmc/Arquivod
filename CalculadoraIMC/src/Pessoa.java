
public class Pessoa {
//exercicio do imc do visualg
//private encapsulamento

	private String nome;
	private double massa;
	private double altura;
	private double imc;

	// construtor
	public Pessoa(String nome, double massa, double altura) {
		this.nome = nome;
		this.massa = massa;
		this.altura = altura;

		// metodo
	}

	public void calculaImc() {
		this.imc = this.massa / (this.altura * this.altura);
	}

	public String retornaCategoriaPeso() {
		if (this.imc < 17) {
			return "Muito abaixo do peso";
		}
		if (this.imc < 18.5) {
			return "abaixo do peso";
		}
		if (this.imc < 25) {
			return "peso ideal";
		}
		if (this.imc < 30) {
			return "sobrepeso";
		}
		if (this.imc < 35) {
			return "obesidade";
		}
		if (this.imc < 40) {
			return "obsedade severa";
		}
		return "obesidade morbida";
	}

	public String getNome() {
		return this.nome;
	}

	public double getMassa() {
		return this.massa;
	}

	public double getAltura() {
		return this.altura;
	}

	public double getImc() {
		return this.imc;
	}

}
