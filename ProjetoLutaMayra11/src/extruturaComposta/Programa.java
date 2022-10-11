package extruturaComposta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Programa {

	private static Scanner scanner;
	// private static Luta[] lutasAgendadas = new Luta[10];

	// mudou arraylist --as duas coleçoes de arrays sao privado e static
	private static ArrayList<Luta> lutasAgendadas = new ArrayList<Luta>(); // guarda a lista de lutas
	private static ArrayList<Lutador> lutadores = new ArrayList<Lutador>(); // guarda a lista do nome dos lutadores
	private static ArrayList<Juiz> juizesListados = new ArrayList<Juiz>();
	private static ArrayList<Juiz> juizesRemovidos = new ArrayList<Juiz>();
	private static ArrayList<Juiz> juizesAgendados = new ArrayList<Juiz>();

	// ArrayList<Luta>LutasAgendadas = ArrayList<>Luta();

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		Lutador prettyBoy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1, 0);
		Lutador putscript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3, 0);
		Lutador snapshadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1, 0);
		Lutador deadCode = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2, 0);
		Lutador ufoCobol = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3, 0);
		Lutador nerdaart = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4, 0);

		lutadores.add(prettyBoy);
		lutadores.add(putscript);
		lutadores.add(snapshadow);
		lutadores.add(deadCode);
		lutadores.add(ufoCobol);
		lutadores.add(nerdaart);

		Juiz antonio = new Juiz("Antonio", "Brasil", 40, 0.05, 12);
		Juiz bernardo = new Juiz("Bernardo", "Brasil", 50, 0.05, 10);
		Juiz carlos = new Juiz("Carlos", "Brasil", 40, 0.05, 12);
		Juiz dario = new Juiz("dario", "Brasil", 40, 0.05, 12);
		Juiz eduardo = new Juiz("eduardo", "Brasil", 40, 0.05, 12);
		Juiz fabricio = new Juiz("fabricio", "Brasil", 40, 0.05, 12);
		Juiz gabriel = new Juiz("Gabriel", "Brasil", 40, 0.05, 12);
		Juiz hugo = new Juiz("Hugo", "Brasil", 40, 0.05, 12);
		Juiz higor = new Juiz("higor", "Brasil", 40, 0.05, 12);
		Juiz joao = new Juiz("Joao", "Brasil", 40, 0.05, 12);

		juizesListados.add(antonio);
		juizesListados.add(bernardo);
		juizesListados.add(carlos);
		juizesListados.add(dario);
		juizesListados.add(eduardo);
		juizesListados.add(fabricio);
		juizesListados.add(gabriel);
		juizesListados.add(hugo);
		juizesListados.add(higor);
		juizesListados.add(joao);

		// Lutador lutador[] = { prettyBoy, putscript, snapshadow, Juiz antonio = new
		// Juiz("Antonio", "Brasil", 40, 0.05, 12);deadCode, ufoCobol,
		// nerdaart };
		// Laço de repetição dos nossos menus. Se a opção do menu principal for = 4,
		// para de repetir.
		int ler = 0; // inicializando paraa leitura do switch
		do {
			ler = gerarMenuPrincipal(); // alterar
			switch (ler) {
			case 1:
				Lutador lutadorSelecionado = selecionarLutador(lutadores);
				if (lutadorSelecionado != null) {
					lutadorSelecionado.status();
				}
				break;
			case 2:
				adicionarLutadores();
				break;

			case 3:
				gerarMenuJuizes();
				break;

			case 4:
				agendarLutas(lutadores);
				break;

			case 5:
				consultarAgendamentos();
				break;

			case 6:
				realizarLutas();
				break;

			}

		} while (ler != 7);

	}

//add adicionei duas opcoes
	private static int gerarMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1- Consultar dados dos lutadores");
		System.out.println("2- Adicionar Lutador");
		System.out.println("3- Juízes");
		System.out.println("4- Agendar lutas ");
		System.out.println("5- Consultar Lutas agendadas");
		System.out.println("6- Realizar lutas");
		System.out.println("7- Sair .");
		return scanner.nextInt();
	}

	private static void consultarAgendamentos() {
		// o array.lenght- ele olha o numero no final do vetor
		// arraylist usa o size

		for (int i = 0; i < lutasAgendadas.size(); i++) {
			// array[i] le o q ta dentro do cochete
			Luta luta = lutasAgendadas.get(i);
			System.out.println(luta.getDesafiante().getNome() + " X " + luta.getDesafiado().getNome());
		}

	}

	private static void adicionarLutadores() {
		String nome;
		String pais;
		int idade;
		float altura;
		float peso;
		double totalPremios;
		System.out.println(" Qual é o nome do lutador? ");
		nome = scanner.next();
		System.out.println(" Qual é o pais? ");
		pais = scanner.next();
		System.out.println("Qual é a idade? ");
		idade = scanner.nextInt();
		System.out.println("Qual é a altura? ");
		altura = scanner.nextFloat();
		System.out.println("Qual é o peso? ");
		peso = scanner.nextFloat();
		System.out.println("Valor inicial em prêmio ");
		totalPremios = scanner.nextDouble();

		Lutador novoLutador = new Lutador(nome, pais, idade, altura, peso, 0, 0, 0, totalPremios);
		lutadores.add(novoLutador);

	}

	public static void gerarMenuJuizes() {
		int ler = 0;
		do {
			System.out.println("MENU DE JUÍZES");
			System.out.println("1- Cadastrar novo Juíz");
			System.out.println("2- Remover Juiz");
			System.out.println("3-Consultar");
			System.out.println("4-Sair");

			ler = scanner.nextInt();

			switch (ler) {
			case 1:
				cadastrarNovoJuiz();
				break;
			case 2:
				removerJuizes();
				break;
			case 3:
				consultarDadosJuiz();
				break;
			}
		} while (ler != 4);

	}

//		
	private static void listarJuizes(ArrayList<Juiz> juizesListados) {
		Iterator<Juiz> iterator2 = juizesListados.iterator();
		System.out.println("Lista de juízes cadastrados");
		while (iterator2.hasNext()) {
			Juiz juizCadastrado = iterator2.next();
			System.out.println(juizCadastrado.getNome());
			juizesListados.add(juizCadastrado);
		}

		// int i;
//		System.out.println(" Lista de Juízes ");
//		for (i = 0; i < juizesGuardados.size(); i++) {
//			System.out.println("[" + (i + 1) + "]" + juizesGuardados.get(i).getNome());
//		}
//		int resposta = scanner.nextInt();

	}

	private static void ArrayjuizesAgendados() {
		ArrayList<Juiz> juizesAgendados = new ArrayList<>();
		Iterator<Luta> lutasIterator = lutasAgendadas.iterator();

		System.out.println("Lista de juízes agendados");
		while (lutasIterator.hasNext()) {
			Luta luta = lutasIterator.next();
			juizesAgendados.add(luta.getJuiz());
		}
	}

	public static void consultarDadosJuiz() {
		// poderia usar o to string

		int i;
		for (i = 0; i < juizesListados.size(); i++) {
			Juiz juiz = juizesListados.get(i);
			System.out.println((i + 1) + "º" + " JUÍZ :");
			System.out.println("Nome: " + juiz.getNome());
			System.out.println("Nacionalidade: " + juiz.getNacionalidade());
			System.out.println("Idade: " + juiz.getIdade());
			System.out.println("% da Comissão: " + juiz.getComissao());
			System.out.println("Tempo de Experiência: " + juiz.getAnosDeExperiencia());
			System.out.println("Lutas já realizadas: " + juiz.obterQtdLutasRealizadas());
			System.out.println("Total comissão de ganhos: " + juiz.obterTotalComissaoLutasRealizadas());
			System.out.println("Média de comissões ganhas: " + juiz.obterMediaComissaoLutasRealizadas());
			System.out.println(">>>>>>>>>>>> Detalhes de Lutas:");
			System.out.println(" ");
			for (int j = 0; j < juiz.getLutasRealizadas().size(); j++) {
				Luta luta = juiz.getLutasRealizadas().get(j);
				System.out.println("SÓ APARECE QUANDO TEM LUTA REALIZADA!!");
				System.out.println("Luta " + (j + 1));
				System.out.println("Desafiante : " + luta.getDesafiante().getNome());
				System.out.println(" vs. ");
				System.out.println("Desafiado : " + luta.getDesafiado().getNome());
				System.out.println("Aprovada: " + luta.isAprovada());
				System.out.println("Valor prêmio da luta: " + luta.getPremioPorLuta());
				System.out.println("valor da comissão da luta: " + luta.calcularComissaoJuiz());
				System.out.println("Percentual de comissão: " + luta.getPercentualComissao());
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println(" ");
			}
		}
	}

	public static void removerJuizes() {
		System.out.println(" Quantidade dos arrays listados " + juizesListados.size());

		Juiz juizListado = null;
		for (int i = 0; i < juizesListados.size(); i++) {
			juizListado = juizesListados.get(i);

			boolean podeRemover = true;

			Juiz juizAgendado = null;
			for (int j = 0; j < lutasAgendadas.size(); j++) {
				juizAgendado = lutasAgendadas.get(j).getJuiz();

				if (juizAgendado == juizListado) {
					podeRemover = false;
				}

			}
			if (podeRemover) {
				juizesRemovidos.add(juizListado);
			} else {
				System.out.println("Não pode ser removido");

			}
		}
		juizesListados.removeAll(juizesRemovidos);
	

	}
////		
//		if (! juizesListados.equals(juizesAgendados)) {
//		juizesRemovidos.add(juizesRemovidos)
//			juizesListados.removeAll(juizesAgendados);
//			
//		}
//		}

	private static void cadastrarNovoJuiz() {

		System.out.println("Vamos adicionar um novo Juíz");

		System.out.print("Nome do Juiz: ");
		String nome = scanner.next();

		System.out.print("Nacionalidade do Juíz: ");
		String nacion = scanner.next();

		System.out.print("Idade do Juíz: ");
		int id = scanner.nextInt();

		System.out.print("Comissão do Juíz: ");
		double comissao = scanner.nextDouble();

		System.out.print("Anos de Experiência do Juíz: ");
		int ade = scanner.nextInt();

		Juiz novoJuiz = new Juiz(nome, nacion, id, comissao, ade);
		System.out.println("Validando dados do juíz...");
		// comparação de juizes
		boolean juizValido = true;
		for (int i = 0; i < juizesListados.size(); i++) {
			Juiz juiz = juizesListados.get(i);

			if (juiz.getNome().equals(novoJuiz.getNome()) && juiz.getNacionalidade().equals(novoJuiz.getNacionalidade())
					&& juiz.getIdade() == novoJuiz.getIdade()) {
				System.out.println("Juiz já cadastrado ou nome duplicado.");
				juizValido = false;
				break;
			}
		}
		if (juizValido) {
			System.out.println("Critérios atendidos!Novo Juiz adicionado com sucesso!!");
			juizesListados.add(novoJuiz);
		}
	}

	private static void listarLutadores(ArrayList<Lutador> lutadores) {
		int i;
		for (i = 0; i < lutadores.size(); i++) {
			System.out.println("[" + (i + 1) + "]" + lutadores.get(i).getNome());
		}
		System.out.println("[" + (i + 1) + "] Sair");

	}

	private static void agendarLutas(ArrayList<Lutador> lutador) {
		System.out.println("Confira  agora as lutas já agendadas ! ");
		for (int i = 0; i < lutasAgendadas.size(); i++) {
			Luta lutaGuardada = lutasAgendadas.get(i);
			if (lutaGuardada != null) {
				System.out.println((i + 1) + "a luta");
				System.out.println("Desafiante : " + lutaGuardada.getDesafiante().getNome());
				System.out.println("Desafiado : " + lutaGuardada.getDesafiado().getNome());

			}
		}
//		Lutador lutadorDesafiante, lutadorDesafiado;

		System.out.println("Bem-vindo ao agendamento de lutas!");
		System.out.println("Escolha o desafiante: ");

		Lutador lutadorDesafiante = selecionarLutador(lutador); // Lutador= classe lutadordesafiante=variavel
		// selecionarlutador é um metodo q ja fiz (lutador) = to guardando o lutador
		// desafiante escolhido dentro da variavel

		if (lutadorDesafiante != null) {
			System.out.println("Escolha o desafiado: ");
			Lutador lutadorDesafiado = selecionarLutador(lutador);
			if (lutadorDesafiado != null) {

				int aleatorio = new Random().ints(0, 9).findFirst().getAsInt();
				// imprlementamos o random para sortear os juizes
				Juiz juiz = juizesListados.get(aleatorio);
				System.out.println("Juiz sorteado para luta: " + juiz.getNome());
				System.out.println("Deseja considerar os expectadores na distribuição de prêmio?");
				System.out.println("Digite [1] sim / [2] não");

				int respostaUsuario = scanner.nextInt();
				boolean considerarExpectador = false;
				do {
					switch (respostaUsuario) {
					case 1:
						considerarExpectador = true;

					case 2:
						considerarExpectador = false;
					}

				} while (respostaUsuario != 1 && respostaUsuario != 2);

				Luta lutaAgendada = new Luta(lutadorDesafiante, lutadorDesafiado, 400, 0.05, juiz,
						considerarExpectador);
				// 400 é o valor da luta
				lutaAgendada.marcarLuta(); // Rever/////
				if (lutaAgendada.isAprovada()) {
					lutasAgendadas.add(lutaAgendada);
				}
			}
		}

	}

	private static void realizarLutas() {
		boolean lutaEncontrada = false;
		for (int i = 0; i < lutasAgendadas.size(); i++) {
			Luta lutaAgendada = lutasAgendadas.get(i);

			if (lutaAgendada != null) {
				lutaAgendada.lutar();
				lutaEncontrada = true;
			}

		}
		if (!lutaEncontrada) {
			System.out.println("Não há lutas agendadas.");
		} else {
			lutasAgendadas = new ArrayList<>();
		}
	}

	private static Lutador selecionarLutador(ArrayList<Lutador> lutador) {
		int opcaoLutador;
		Lutador lutadorSelecionado = null;
		do {
			listarLutadores(lutador);

			System.out.println("De qual lutador você deseja ver os atributos?");
			opcaoLutador = scanner.nextInt();

			if (opcaoLutador >= 1 && opcaoLutador <= lutador.size()) {
				System.out.println("Você escolheu o lutador: " + lutador.get(opcaoLutador - 1).getNome());
				lutadorSelecionado = lutador.get(opcaoLutador - 1);
				break;
			} else if (opcaoLutador == (lutador.size() + 1)) {
				System.out.println("Finalizando");
			} else {
				System.out.println("Opção Inválida!!");
			}

		} while (opcaoLutador != lutador.size() + 1);
		return lutadorSelecionado;
	}
}
// TAREFA: QUEM GANHOU A LUTA?

//ESCOLHER O JUIS?
//COMO FAZEMOS A SAIDA DISSO?