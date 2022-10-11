package extruturaComposta;

import java.util.Random;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private boolean considerarExpectador;
	private int rounds;
	private boolean aprovada;
	private double premioPorLuta;
	private double percentualComissao; // fazer conta
	private Juiz juiz;

	// metodo construtor
	public Luta(Lutador desafiante, Lutador desafiado, double premioPorLuta, double percentualComissao, Juiz juiz,
			boolean expectador) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.premioPorLuta = premioPorLuta;
		this.percentualComissao = percentualComissao;
		this.juiz = juiz;
		this.considerarExpectador = considerarExpectador;
	}

	// metodo
	public double calcularComissaoJuiz() {
		return premioPorLuta * juiz.getComissao();
	}

	// sobrecarga do metodo acima
	public double calcularComissaoJuiz(int expectadores) {
		if (expectadores < 500) {
			return (premioPorLuta * juiz.getComissao()) + 100;
		} else if (expectadores < 2000) {
			return (premioPorLuta * juiz.getComissao()) + 500;
		} else {
			return (premioPorLuta * juiz.getComissao()) + 1000;
		}
	}

	public void setPremioPorLuta(double premioPorLuta) {
		this.premioPorLuta = premioPorLuta;
		// premioporeluta = premioporluta + premioporluta
	}

	public void marcarLuta() {
		if ((desafiante.getCategoria() == desafiado.getCategoria()) && (desafiante != desafiado)) {
			System.out.println("Luta marcada!");
			System.out.println("entre: " + desafiante.getNome() + "e " + desafiado.getNome());
			this.aprovada = true;
		} else {
			System.out.println(" A luta não pode ser marcada. ");
			this.aprovada = false;
		}
	}

	public void lutar() { // IMPLEMENTAR O METODO
		if (this.aprovada) {

			System.out.println("Apresentamos os lutadores: " + desafiante.getNome() + "e " + desafiado.getNome());
			System.out.println("No lado esquerdo, temos: ");
			desafiante.status();
			System.out.println(" No lado direito, temos: ");
			desafiado.status();
			System.out.println("E o juiz é o: " + juiz.getNome());
			juiz.getLutasRealizadas().add(this);

//random para expectadores
			Random randomExpectador = new Random();
			int expectadores = randomExpectador.nextInt(3000);
			System.out.println(">>>>>>>>>> EXPECTADORES: " + expectadores + "<<<<<<<<<<");
			System.out.println(" ");
			System.out.println(">>>Número de expectadores<<< " + expectadores);

			Random random = new Random();
			int aleatorio = random.ints(0, 2).findFirst().getAsInt();
		
			switch (aleatorio) {
			case 0:
                if (considerarExpectador) {
                    System.out.println(" EMPATOU ");
                    System.out.println("Dividindo o Prêmio da Luta");
                    calcularComissaoJuiz(expectadores);
                    double imprimirValor = calcularComissaoJuiz(expectadores);
                    System.out.println("Comissão Adicional do Juiz: "+imprimirValor);
                    desafiado.empatarLuta(premioPorLuta / 2);
                    desafiante.empatarLuta(premioPorLuta / 2);
                } else {
                    System.out.println(" EMPATOU ");
                    System.out.println("Dividindo o Prêmio da Luta");
                    calcularComissaoJuiz();
                    desafiado.empatarLuta(premioPorLuta / 2);
                    desafiante.empatarLuta(premioPorLuta / 2);
                }
                break;
            case 1:
                if (considerarExpectador = true) {
                    System.out.println("GANHOU  " + desafiante.getNome());
                    calcularComissaoJuiz(expectadores);
                    double imprimirValor = calcularComissaoJuiz(expectadores);
                    System.out.println("Comissão do Juiz: "+imprimirValor);
                    desafiante.ganharLuta(premioPorLuta, expectadores);
                    desafiado.perderLuta();
                } else if (considerarExpectador = false) {
                    System.out.println("GANHOU  " + desafiante.getNome());
                    calcularComissaoJuiz();
                    desafiante.ganharLuta(premioPorLuta);
                    desafiado.perderLuta();
                }
                break;

            case 2:
                if (considerarExpectador) {
                    System.out.println("GANHOU  " + desafiante.getNome());
                    calcularComissaoJuiz(expectadores);
                    double imprimirValor = calcularComissaoJuiz(expectadores);
                    System.out.println("Comissão do Juiz: "+imprimirValor);
                    desafiante.perderLuta();
                    desafiado.ganharLuta(premioPorLuta, expectadores);
                } else if (considerarExpectador = false) {
                    System.out.println("GANHOU  " + desafiante.getNome());
                    calcularComissaoJuiz();
                    desafiante.perderLuta();
                    desafiado.ganharLuta(premioPorLuta);
                }
                break;
			}
		} else {
			System.out.println("Luta reprovada" + "{{{(>_<)}}}");
		}
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public double getPremioPorLuta() {
		return premioPorLuta;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public boolean isConsiderarExpectador() {
		return considerarExpectador;
	}

	public void setConsiderarExpectador(boolean ConsiderarExpectador) {
		this.considerarExpectador = considerarExpectador;
	}

}