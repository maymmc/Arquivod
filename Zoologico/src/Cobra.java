
public class Cobra extends Reptil {

	public Cobra(double peso, int idade, int membros, String especie, String registro, String corEscama) {
		super(peso, idade, membros, especie, registro, corEscama);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println(" Ela se locomove rastejando rastejando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println(" come bichos");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println(" o som é um guizo");
	}

	@Override
	public void trocaPele() {
		System.out.println(" e troca de pele de 6 em 6 meses");
		// TODO Auto-generated method stub

	}

}
