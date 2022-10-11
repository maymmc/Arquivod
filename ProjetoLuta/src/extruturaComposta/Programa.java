package extruturaComposta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Programa {

	private static Scanner scanner;
	// private static Luta[] lutasAgendadas = new Luta[10];

	// mudou arraylist --as duas coleçoes de arrays sao privado e static
	private static ArrayList<Luta> lutasAgendadas = new ArrayList<Luta>(); //guarda a lista de lutas
	private static ArrayList<Lutador> lutadores = new ArrayList<Lutador>(); //guarda a lista do nome dos lutadores
//	ArrayList<Luta>LutasAgendadas = ArrayList<>Luta(); 

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		Lutador prettyBoy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		Lutador putscript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		Lutador snapshadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		Lutador deadCode = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		Lutador ufoCobol = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		Lutador nerdaart = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		lutadores.add(nerdaart);
		lutadores.add(deadCode);
		lutadores.add(prettyBoy);
		lutadores.add(ufoCobol);
		lutadores.add(snapshadow);
		lutadores.add(putscript);
		
		// Lutador lutador[] = { prettyBoy, putscript, snapshadow, deadCode, ufoCobol,
		// nerdaart };
		// Laço de repetição dos nossos menus. Se a opção do menu principal for = 4,
		// para de repetir.
		int ler = 0;
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
				agendarLutas(lutadores);
				break;

			case 4:
				consultarAgendamentos();
				break;

			case 5:
				realizarLutas();
				break;

			}

		} while (ler != 6);

	}

//add adicionei duas opcoes
	private static int gerarMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1- Consultar dados dos lutadores");
		System.out.println("2- Adicionar Lutador");
		System.out.println("3- Agendar lutas ");
		System.out.println("4- Consultar Lutas agendadas");
		System.out.println("5- Realizar lutas");
		System.out.println("6- Sair .");
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

		Lutador novoLutador = new Lutador(nome, pais, idade, altura, peso, 0, 0, 0);
		lutadores.add(novoLutador);

	}

	private static void listarLutadores(ArrayList<Lutador> lutador) {
		int i;
		for (i = 0; i < lutador.size(); i++) {
			System.out.println("[" + (i + 1) + "]" + lutador.get(i).getNome());
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
		Lutador lutadorDesafiante, lutadorDesafiado;
		System.out.println("Bem-vindo ao agendamento de lutas!");
		System.out.println("Escolha o desafiante: ");
		lutadorDesafiante = selecionarLutador(lutador);
		if (lutadorDesafiante != null) {
			System.out.println("Escolha o desafiado: ");
			lutadorDesafiado = selecionarLutador(lutador);
			if (lutadorDesafiado != null) {
				Luta lutaAgendada = new Luta(lutadorDesafiante, lutadorDesafiado);
				lutaAgendada.marcarLuta();

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
