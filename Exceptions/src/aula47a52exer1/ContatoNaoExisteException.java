package aula47a52exer1;

public class ContatoNaoExisteException extends Exception {

	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
		@Override
		public String getMessage() {
			return "contato" +nomeContato + "nao existe na agenda";
		}
		
	
	
}
	

