import interfaces.AnimalDeEstimacao;
import interfaces.AnimalDomestico;

public class Cavalo extends Mamifero implements  AnimalDomestico {

	public Cavalo(double peso, int idade, int membros, String especie, String registro, int qtdadesglandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, registro, qtdadesglandulasMamarias, corPelo);
		// TODO Auto-generated constructor stub
	}

	public void darCoice() {
		System.out.println("Ele dá coice com as pernas de tras");

	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println(" Se locomove trotando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("come capim");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println(" o som é relinchando");
	}

	@Override
	public void levarNoVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}

}
