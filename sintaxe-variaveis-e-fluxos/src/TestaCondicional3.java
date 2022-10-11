
public class TestaCondicional3 {

public static void main(String[] args) {

	int idade = 16;
	int quantidadePessoas = 2;
	boolean acompanhado = quantidadePessoas >= 2;
	//ou = || e  e = &&
	
	if (idade >= 18 && acompanhado) {
	
		System.out.println("seja bem vindo");
	

	} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
