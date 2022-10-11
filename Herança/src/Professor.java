
public class Professor extends Pessoa{

	
	private String especialidade;
	private double salario;
	
	
	
	//metodo
	public void receberAumento(double aumento) {
		this.setSalario(getSalario() + aumento );
		
	}


	//metodo construtor com class
	public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	
	//get e set
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
