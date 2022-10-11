package aula54enumeradorescomoclasse;

public class Teste {
	public static void main(String[] args) {
		
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		
		
		Data data = new Data(20, 9, 2022, DiaSemana.TERCA);
	}
	
	
}
