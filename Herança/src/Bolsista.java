
public class Bolsista extends Aluno {

	
	private float bolsa;
	 
	
	
	
	public void renovarBolsa() {
		System.out.println("Está renovando sua bolsa. ");
	}
	
	@Override
	public void pagarMensalidade () {
		System.out.println("Não há necessidade de pagamento da mensalidade");
		
		
	}
	
	public Bolsista(String nome, int idade, char sexo, boolean matriculado, String curso) {
		super(nome, idade, sexo, matriculado, curso);
	
	}

	@Override
    public String toString() {
        return super.toString() + "Bolsista [bolsa=" + bolsa + "]";
    }
	
	
	
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
