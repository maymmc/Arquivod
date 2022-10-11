
public abstract class Pessoa {
//public class Pessoa
	//atributo
	private String nome;
	private int idade;
	private char sexo;
	
	
	//metodo
	
	@Override
	
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }
	
	public void fazerAniversario() {
		//implementaçao do metodo
		this.setIdade(getIdade () +1);
		}
	
//	//metodo construtor
	public Pessoa (String nome, int idade,char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//get e set
	
	
	

//	metodo:
//	fazerAniversário( )
}
