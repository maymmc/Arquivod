package extruturaComposta;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private Categoria categoria;
	private int vitoria;
	private int derrota;
	private int empate;

	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
		
		//this.nome = nome;
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitoria(vitoria);
		this.setDerrota(derrota);
		this.setEmpate(empate);
	}
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		
	}
	public void status() {
		System.out.println("--------------------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Vitórias: " + this.vitoria);
		System.out.println("Derrotas: " + this.derrota);
		System.out.println("Empates: " + this.empate);
		System.out.println("--------------------------------------");
	}
	public void ganharLuta() {
		System.out.println("Ganhando luta");
		this.setVitoria(this.getVitoria()+1);
		this.status();
	}
	public void perderLuta() {
		System.out.println("Perdeu luta");
		this.derrota++;
		this.status();
	}
	public void empatarLuta() {
		System.out.println("Empatou");
		this.empate = this.empate + 1;
		this.status();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public Categoria getCategoria() {
		return categoria;
	}
	private void setCategoria() {
//		if(this.getPeso()<52.2) {
//			this.categoria = Categoria.Inválido;
//		}else if(this.getPeso()<=70.3) {
//			this.categoria = Categoria.Inválido;
//		}
			if (peso < 52.2) {
				this.categoria = Categoria.Inválido;
			}else if(this.peso <= 70.3) {
				this.categoria = Categoria.Leve;
			}else if(this.peso <= 83.9) {
				this.categoria = Categoria.Médio;
			}else if(this.peso <= 120.2) {
				this.categoria = Categoria.Pesado;
			}else
				this.categoria = Categoria.Inválido;
		
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getDerrota() {
		return derrota;
	}
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
}

