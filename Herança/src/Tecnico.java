
public class Tecnico extends Aluno {
	
	

	private int registroProfissional;
	
	public void praticar () {
		System.out.println("Tecnico está praticando");
	}
		
	@Override
	public void pagarMensalidade () {
		if(this.isMatriculado())
		System.out.println("o valor da sua mensalidade nao tera desconto ");{
			
		}
	}
	
	
public Tecnico(String nome, int idade, char sexo, boolean matriculado, String curso, int registroProfissional) {
		super(nome, idade, sexo, matriculado, curso);
		this.registroProfissional = registroProfissional;
		
		
	}
public int getRegistroProfissional() {
	return registroProfissional;
}
public void setRegistroProfissional(int registroProfissional) {
	this.registroProfissional = registroProfissional;
}
	
}
