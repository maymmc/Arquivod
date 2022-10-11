
public class Programa {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações do Gato");
		Gato girfild = new Gato(2, 1, 4, "Persa", "Persa", 8, "branco");
		girfild.alimentar();
		girfild.arranhar();
		girfild.brincar();
		girfild.emitirSom();
		girfild.levarNoVeterinario();
		girfild.levarPraPassear();
		girfild.brincar();

		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações do Cavalo ");
		Cavalo bernard = new Cavalo(300, 20, 4, "Equus ferus", "Equidno", 4, "bege");
		bernard.darCoice();
		bernard.locomover();
		bernard.alimentar();
		bernard.emitirSom();
		bernard.levarNoVeterinario();
		bernard.chamarVeterinario();

		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações do Cachorro");

		Cachorro luna = new Cachorro(7, 8, 4, "shihtzu ", "shihtzu ", 6, "preta e branca");
		luna.correr();
		luna.locomover();
		luna.alimentar();
		luna.emitirSom();
		luna.levarPraPassear();
		luna.brincar();
		luna.levarNoVeterinario();
		luna.chamarVeterinario();

		System.out.println("informações da cobra");
		Cobra vibora = new Cobra(800, 1, 0, "terra", "preta", "viburos");
		vibora.alimentar();
		vibora.emitirSom();
		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações da Nemo");

		Nemo nemo1 = new Nemo(19, 2, 2, "palhaço", "laranja", "palhaço");
		nemo1.alimentar();
		nemo1.emitirSom();
		nemo1.mudarSexo(2);
		nemo1.locomover();
		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações da beija flor");

		BeijaFlor cuitelo = new BeijaFlor(60, 1, 2, "brilho de fogo", "marron", "beija-flor");
		cuitelo.alimentar();
		cuitelo.emitirSom();
		cuitelo.locomover();
		cuitelo.baterAsasVeloz();
		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações da joaninha");

		Joaninha asiatica = new Joaninha(2, 1, 6, "asiatica multicolorida", "vermelha e preta", "joaninha", 0);
		asiatica.alimentar();
		asiatica.emitirSom();
		asiatica.locomover();
		asiatica.fingirDeMorta();
		System.out.println("");
		System.out.println("....................................................");
		System.out.println("informações da Canguru");

		Canguru macropusRufos = new Canguru(38, 1, 4, "Macropus Rufos", "Macropus", 9, "marron", true);
		macropusRufos.alimentar();
		macropusRufos.emitirSom();
		macropusRufos.locomover();
		macropusRufos.usarBolsa();

		System.out.println("....................................................");
		System.out.println("informações do Ornitorrinco");

		Ornitorrinco ornitorrinco = new Ornitorrinco(2, 4, 4, "Ornithorhynchus anatinus", "Ornitorrinco", 5, "cinza",
				false);
		ornitorrinco.alimentar();
		ornitorrinco.emitirSom();
		ornitorrinco.locomover();
		ornitorrinco.botarOvo();
		System.out.println("");
		System.out.println("....................................................");

	}
}