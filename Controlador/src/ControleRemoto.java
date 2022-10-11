
public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

//GET E SET	
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// METODOS
	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);

	}

	@Override
	public void abrirMenu() {
		if (this.isLigado() == true) {
			System.out.println(" Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.println(" Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.println("||");
			}
		} else {
			System.out.println("Não foi possível acessar menu pois a TV está desligada ");
		}
	}

	@Override
	public void fecharMenu() {
		if (this.isLigado()) {
			System.out.println(" Fechando o Menu ");
		} else {
			System.out.println("Não é possível mostrar o meunu pois a TV está desligada");
		}
	}
	public void aumentarVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 10);
		}
		}

	public void diminuirVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 10);
		}
		}
	public void ligarMudo() {
		if (this.isLigado() && this.volume > 0);
}

	

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.volume == 0) {
            this.setVolume(50);
  }
        }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);

        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}