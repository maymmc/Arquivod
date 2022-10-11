
public class Bebida extends Item {
	
	
	private String nome;
	private int volume;
	private boolean bebidaAlcolica;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isBebidaAlcolica() {
		return bebidaAlcolica;
	}
	public void setBebidaAlcolica(boolean bebidaAlcolica) {
		this.bebidaAlcolica = bebidaAlcolica;
	}

}
