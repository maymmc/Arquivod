
public class Programa {
//metodo principal - static= os objetos sao iguais e n vao mudar
	public static void main(String[] args) {

		// objeto= variavel
		// Cafe cafe; //objeto q criamos //instanciar um objeto = criar uma variavel
		// int numero; //primitivo
		// new = inicialização do objeto

		
		
		Embalagem embalagemMelita = new Embalagem();
		embalagemMelita.fabricante = "Astromex";
		embalagemMelita.formato = "caixa";

		TipoGrao graoMelita = new TipoGrao(); // metodo
		graoMelita.classificação = Classificacao.Gourmet;

		Cafe cafeMelita = new Cafe(); // lugar q guardou um lugar na memoria
		cafeMelita.nome = "Melita";
		cafeMelita.vencimento = "20/07/2022";
		cafeMelita.embalagem = embalagemMelita;
		

		Cafe cafePilao = new Cafe();
		cafePilao.nome = "Pilao"; //instania
		
		
		

	}
}