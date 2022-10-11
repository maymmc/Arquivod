
public class Ave extends Animal  {
	
	private String CorPena;
	
	public Ave (double peso, int idade, int membros, String corPena) {
		super(peso, idade, membros);
		this.CorPena = corPena;
		
		
		
		
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("comendo frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("som da ave");
		
	}

	
	
	
	
	public String getCorPena() {
		return CorPena;
	}

	public void setCorPena(String corPena) {
		CorPena = corPena;
	}

	
	
	
	
	
}
