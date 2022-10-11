
public class Aluno extends Pessoa {

	private boolean matriculado;
	private String curso;

	// construtor com superclass

	public Aluno(String nome, int idade, char sexo, boolean matriculado, String curso) {
		super(nome, idade, sexo);
		this.matriculado = matriculado;
		this.curso = curso;
	}

//metodo
	
	public void pagarMensalidade () {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}
	
	@Override
    public String toString() {
        return super.toString() + "Aluno [matriculado=" + matriculado + ", curso=" + curso + "]";
	}
	
	
	
	public void cancelarMatricula() {
		// implementação--
		if (isMatriculado()) {
			matriculado = false;
			System.out.println(" Matricula cancelada. ");

		}

	}

	public void statusAluno() {
		System.out.println("\nNome: " + this.getNome() + "\nSexo: " + this.getSexo() + "\nIdade: " + this.getIdade()
				+ "\nMatricula: " + this.isMatriculado() + "\nCurso: " + this.getCurso());
	}

	// get e set
	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
