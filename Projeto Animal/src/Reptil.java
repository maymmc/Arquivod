
public class Reptil extends Animal {

	private String corEscama;

	public Reptil(double peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;

	}

	@Override // to sobrepondo ele- herdando
	public void locomover() {
		System.out.println("rastejando");

	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("so de reptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}