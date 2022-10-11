package extruturaComposta;

public class Lutador extends Pessoa {

	private float altura;
	private float peso;
	private Categoria categoria;
	private int vitoria;
	private int derrota;
	private int empate;
	private double totalPremios;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota,
			int empate, double totalPremios) {
		super(nome, nacionalidade, idade);
		this.altura = altura;
		this.setPeso(peso);
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
		this.totalPremios = totalPremios;
	}

	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + this.altura);

	}

	public void status() {
		System.out.println("--------------------------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Vitórias: " + this.vitoria);
		System.out.println("Derrotas: " + this.derrota);
		System.out.println("Empates: " + this.empate);
		System.out.println(" Premios acumulados em lutas " + this.totalPremios);
		System.out.println("--------------------------------------");
	}

	public void ganharLuta(double premio) {
		System.out.println("Ganhando luta");
		this.setVitoria(this.getVitoria() + 1);
		totalPremios = totalPremios + premio;
		this.status();
	}

	// sobrecarga
	public void ganharLuta(double premio, int numeroExpectadores) {
		ganharLuta(premio);
		if (numeroExpectadores <= 500) {
			if (categoria == Categoria.Leve) {
				totalPremios += premio * 0.05;
			} else if (categoria == Categoria.Médio) {
				totalPremios += premio * 0.08;
			} else if (categoria == Categoria.Pesado) {
				totalPremios += premio * 0.10;
			}
		} else if (numeroExpectadores <= 2000) {
			if (categoria == Categoria.Leve) {
				totalPremios += premio * 0.08;
			} else if (categoria == Categoria.Médio) {
				totalPremios += premio * 0.12;
			} else if (categoria == Categoria.Pesado) {
				totalPremios += premio * 0.15;
			}
		} else if (numeroExpectadores > 2000) {
			if (categoria == Categoria.Leve) {
				totalPremios += premio * 0.10;
			} else if (categoria == Categoria.Médio) {
				totalPremios += premio * 0.15;
			} else if (categoria == Categoria.Pesado) {
				totalPremios += premio * 0.18;
			}
		}
	}

	public void perderLuta() {
		System.out.println("Perdeu luta");
		this.derrota++;
		this.status();
	}

	public void empatarLuta(double premio) {
		System.out.println("Empatou");
		this.empate = this.empate + 1;
		totalPremios += premio;
		this.status();
	}

	// apaguei pq os atributos nome,nacionalidade e idade estao na classe pessoa

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
		} else if (this.peso <= 70.3) {
			this.categoria = Categoria.Leve;
		} else if (this.peso <= 83.9) {
			this.categoria = Categoria.Médio;
		} else if (this.peso <= 120.2) {
			this.categoria = Categoria.Pesado;
		} else
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

	public double getTotalPremios() {
		return totalPremios;
	}

	public void setTotalPremios(double totalPremios) {
		this.totalPremios = totalPremios;
	}

	
}
