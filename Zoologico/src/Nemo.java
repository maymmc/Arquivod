
public class Nemo extends Peixe {

	public Nemo(double peso, int idade, int membros, String especie, String registro, String corEscama) {
		super(peso, idade, membros, especie, registro, corEscama);
		// TODO Auto-generated constructor stub
	}

	public void mudarSexo(int idade) {
		if (idade > 3) {
			System.out.println("Nemo é femea");
		} else if (idade < 3) {
			System.out.println("Nemo é macho");
		}
	}

	@Override
	public void soltarBolha() {
		System.out.println(" O som é BLO BLO BLO");
		// TODO Auto-generated method stub

	}

	@Override
	public void locomover() {
		System.out.println(" se locomove nadando");
		// TODO Auto-generated method stub

	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta de peixes e algas");
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSom() {
		System.out.println(" seu som é glu glu glu");
		// TODO Auto-generated method stub

	}

}
