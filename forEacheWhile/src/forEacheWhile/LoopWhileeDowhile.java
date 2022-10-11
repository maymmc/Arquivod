package forEacheWhile;

public class LoopWhileeDowhile {

	public static void main(String[] args) {

		int i = 1;
		int max = 10;
		System.out.println("contando até " + max);

		// enquanto a expresao boleana no () for verdadeira/usando operadores logicos/ o
		// codigo abaixo vai sse repetir
		while (i <= max) { // enaquanto i for menor q o valor maximmo vai printar a mensagem debaixo
			System.out.println("valor de i: " + i);
			i++; // i = i + 1; i+=1;
		}
		System.out.println(i);
	
			//o 1 é menor que 10? ou o i <10(max)? sim! entao printa a mensagem dentro da
			//estrutura e  incrementa mais 1 e volta na expressao while (i < max). 2<10? sim! entao ele
			//printa a mensagem e incrementa 1 e volta na expressao vendo se 3 é menor q 10 e entao repete tudo

//CHEGA O MOMENTO Q A EXPPPRESSAO VAI SER FALSA. 10 NAO É NENOR Q 10!!
//ENTAO ELE N EXECUTA O CODIGO DA ESTRUTURA E PODE COLOCAR UMA MENSAGEM FORA DESSA ESTRUTURA

// WHILE- ENNQUANTO a expressao for verdadeira execute o trecho de codigo		
// DO WHILE - faça enquanto - eu vou fazer alguma coisa enquanto a expressao for verdadeira, o bloco 
		// deixa de ser executado depois da expressao ficar falsa
		
		do {
			i++;
			System.out.println("valor de i: " +i);
		}while (i<20);
		System.out.println(i);
		
	
}
}