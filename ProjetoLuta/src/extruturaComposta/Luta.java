package extruturaComposta;

import java.util.Random;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;

	public Luta(Lutador desafiante, Lutador desafiado) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
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

	public void lutar() {
		if (this.aprovada) {
			System.out.println("Apresentamos os lutadores: " + desafiante.getNome() + "e " + desafiado.getNome());
			System.out.println("No lado esquerdo, temos: ");
			desafiante.status();
			System.out.println(" No lado direito, temos: ");
			desafiado.status();
			;
			Random random = new Random();
			int aleatorio = random.ints(0, 2).findFirst().getAsInt();
			switch (aleatorio) {
			case 0:
				System.out.println("Luta empatada");
				desafiante.empatarLuta();
				desafiado.empatarLuta();
				break;
			case 1:
				System.out.println("O vencedor é " + desafiante.getNome());
				desafiante.ganharLuta();
				desafiado.perderLuta();
				break;
			case 2:
				System.out.println("O vencedor é " + desafiado.getNome());
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			}
		} else {
			System.out.println("Luta não aprovada");
		}
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

}
