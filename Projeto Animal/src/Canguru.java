
public class Canguru extends Mamifero {

	
	
	public Canguru(double peso, int idade, int membros, String corDePelo) {
		super(peso, idade, membros, corDePelo);
		// TODO Auto-generated constructor stub
	}
		
		@Override // to sobrepondo ele- herdando
		public void locomover() {
			System.out.println("saltando");

	}
	public void usarBolsa() {
		System.out.println(" usando bolsa");
	}

}
