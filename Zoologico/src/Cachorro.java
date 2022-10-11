import interfaces.AnimalDeEstimacao;
import interfaces.AnimalDomestico;

public class Cachorro extends Mamifero implements AnimalDomestico, AnimalDeEstimacao {

	public Cachorro(double peso, int idade, int membros, String especie, String registro, int qtdadesglandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, registro, qtdadesglandulasMamarias, corPelo);
	}

	public void correr() {
		System.out.println(" ele nao corre");

	}

	@Override
	public void locomover() {
		System.out.println("se locomove andando");
	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta de ração e frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("seu som é AUAU");

	}

	@Override
	public void brincar() {
		System.out.println("brinca com saco plastico");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPraPassear() {
		System.out.println("passea todos os dias");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarNoVeterinario() {
		System.out.println(" leva no veterinario quando está doente");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		System.out.println("chama o veterinario quando precisa");
		
	}
}
