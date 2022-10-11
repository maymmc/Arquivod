import interfaces.AnimalDeEstimacao;
import interfaces.AnimalDomestico;

public class Gato extends Mamifero implements AnimalDomestico, AnimalDeEstimacao {

	
	public Gato(double peso, int idade, int membros, String especie, String registro, int qtdadesglandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, registro, qtdadesglandulasMamarias, corPelo);
	}

	public void arranhar() {

	}

	@Override
	public void locomover() {
		System.out.println("se locomove andando");
	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta de ração e leite");
	}

	@Override
	public void emitirSom() {
		System.out.println("seu som é MIAU");

	}

	@Override
	public void brincar() {
		System.out.println(" brinca com bolas de lã");
		
	}

	@Override
	public void levarPraPassear() {
		System.out.println("gosta de passear a noite");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarNoVeterinario() {
		System.out.println("leva no veterinario quando tiver doente");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chamarVeterinario() {
		System.out.println("chama o veterinario quando tiver dooente");
		// TODO Auto-generated method stub
		
	}

	

}
