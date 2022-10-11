
public class Joaninha extends Inseto {

	
	
	public Joaninha(double peso, int idade, int membros, String especie, String registro, String corAsa,
			int quantidadePatas) {
		super(peso, idade, membros, especie, registro, corAsa, quantidadePatas);
		// TODO Auto-generated constructor stub
	}

	public void fingirDeMorta() {
		System.out.println("Se finge de morta encolhendo as patinhas");
		
	}

	@Override
	public void polenizar() {
		// TODO Auto-generated method stub
		System.out.println(" poleniza sobrevoando por cima das flores");
	}

	@Override
	public void locomover() {
		System.out.println(" se locomove andando e voando");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		System.out.println("se alimenta comendo insetos");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		System.out.println(" seu som é zzzzzzzzzz");
		// TODO Auto-generated method stub
		
	}
}
