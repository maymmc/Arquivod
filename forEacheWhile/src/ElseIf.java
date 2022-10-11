import java.util.Scanner;

public class ElseIf {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
//	System.out.println("Entre com a sua idade");
//	
//	
//	int idade = scan.nextInt();
//	if(idade >= 18) { //se essa condição for verdadeira a linha debaixo vai ser executada;
//		System.out.println("é maior de idade");
//		//se a linha if(idade >= 18) NAO FOR VERDADEIRA, SE NAO for verdadeira vai aparecer essa linha abaixo
//	}else {
//		System.out.println("Não é maior de idade");
//	}
	
	//barato <=10 - se for barato ele tem q ser menor  10 reais
	//10 < valor <15- pedir desconto -se o vlor tiver entre 10 e 15 pedir um desconto 
	//15<=valor 17 -pesquisar mais - se o valor tiver entre 15 a 17  pesquisar
	//>= 17 - muito caro

		System.out.println("entre com o preço do item");
		double valor = scan.nextDouble();
		
		if (valor < 10) {
			System.out.println("ta barato");
			
		} else if (valor >10 && valor <15) {
			System.out.println("pede um desconto aii !!");
			
		} else if (valor >=15 && valor <17) {
		System.out.println("pesquisar mais");
		
	} else { //valor>=17
		System.out.println("muito caro");
		}
}
}
