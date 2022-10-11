package Aula02;

public class Programa {

	public static void main(String[] args) {
		
		//atributos do classe "principal" com mais caracteristicas especificas
		Caneta bic = new Caneta();
		bic.carga = 1;
		bic.cor = "Azul";
		bic.modelo = "Tinteiro";
		
		bic.tampar(); // chamando para executar a açao de tampar METODO
		bic.rabiscar();
		bic.destampar();
		bic.rabiscar();
		

	}

}
