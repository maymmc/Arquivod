
public class Caneta {

	private String cor;
	private float ponta;
	private boolean tampa;
	private String nome;

	// medodos metodoé uma instrução
	public void rabiscar() {
		if (this.tampa == true) {
			System.out.println("nao é possível rabiscar");
		}
		else {
			System.out.println(" caneta " + nome + "cor" + cor);
		}
	}
	
	//modificadores q sao usados para acessar classes(nao diretamente) proporciona mais segurança
	//get pega uma informação  tem que ter -os atributos e fazer os get e set deles
	//set modificam coisas dentro do objeto - insere uma informaçao
	
	//get( me de um nome) e set (modifica informaçao de variaveis) para atributos
	//metodo tem parenteses deppois kdkckfk();
	//classe atributo get e set 

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampa() {
		return tampa;
	}

	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
			