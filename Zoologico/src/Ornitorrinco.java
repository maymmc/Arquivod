
public class Ornitorrinco extends Mamifero {

	private boolean presençaDeMamilo;

	public Ornitorrinco(double peso, int idade, int membros, String especie, String registro,
			int qtdadesglandulasMamarias, String corPelo, boolean presençaDeMamilo) {
		super(peso, idade, membros, especie, registro, qtdadesglandulasMamarias, corPelo);
		this.presençaDeMamilo = presençaDeMamilo;
	}

	public void botarOvo() {
		System.out.println("1 a 3 ovos cerca de duas semanas depois do acasalamento");
	}

	@Override
	public void locomover() {
		System.out.println(" se locomove nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta de pequenos animais");
	}

	@Override
	public void emitirSom() {
		System.out.println("seu som é tuc tuc tuc");
	}

	public boolean isPresençaDeMamilo() {
		return presençaDeMamilo;
	}

	public void setPresençaDeMamilo(boolean presençaDeMamilo) {
		this.presençaDeMamilo = presençaDeMamilo;
	}

}
