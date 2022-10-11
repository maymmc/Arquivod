
public class Mamifero extends Animal {

	private String corDePelo;

	public Mamifero(double peso, int idade, int membros, String corDePelo) {
		super(peso, idade, membros);
		this.corDePelo = corDePelo;

	}

	@Override// to sobrepondo ele- herdando
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("som do mamifero");
	}

}
