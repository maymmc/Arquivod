
public class ProgramaPrincipal {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero(85.3, 2, 4, "marron");
		mamifero.alimentar();
		mamifero.locomover();
		mamifero.emitirSom();
		System.out.println("visualizando mamifero");
		System.out.println(" ");
		
		Peixe peixe = new Peixe(0.35, 1, 0, "verde");
		peixe.emitirSom();
		peixe.locomover();
		System.out.println("visualizando peixe");
System.out.println("");

		Ave ave = new Ave(0.89, 2, 2, "branco");
		ave.alimentar();
		ave.emitirSom();
		System.out.println("visualizando ave");
		System.out.println(" ");

		Reptil reptil = new Reptil(5.5, 6, 4, "amarelo");
		reptil.emitirSom();
		reptil.locomover();
		System.out.println("visualizando reptil");
		
		System.out.println(" ");
		Mamifero golfinho = new Mamifero(5.70, 8, 4, "cinza");
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		System.out.println("visualizando golfinho");
		System.out.println(" ");
		
		Canguru canguru = new Canguru(55.30, 3, 4, "avermelhado");
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.usarBolsa();
		System.out.println("visualizando canguru");
		System.out.println(" ");
		
		Cachorro cachorro = new Cachorro(3.94, 5, 4, "mel");
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.abanarRabo();
		System.out.println("visualizando cachorro");
		System.out.println(" ");
		cachorro.reagir("olá");
		cachorro.reagir(13, 45 );
	}

}
