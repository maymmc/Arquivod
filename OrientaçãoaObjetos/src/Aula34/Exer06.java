package Aula34;

import java.util.Scanner;

public class Exer06 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		imprimirValor(ConversaoDeUnidadesDeTempo.minutosParaSegundos(4));
		imprimirValor(ConversaoDeUnidadesDeTempo.horasParaMinutos(2));
		imprimirValor(ConversaoDeUnidadesDeTempo.diasParaHoras(2));
		imprimirValor(ConversaoDeUnidadesDeTempo.semanasParaDias(3));
		imprimirValor(ConversaoDeUnidadesDeTempo.mesesParaDias(2));
		imprimirValor(ConversaoDeUnidadesDeTempo.semanasParaDias(2));

		int ler = 0;

		do {
			ler = menu();
			switch (ler) {

			case 1:
				System.out.println("Entre com os minutos que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.minutosParaSegundos(ler);

				break;

			case 2:
				System.out.println("Entre com a quantidade de horas que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.horasParaMinutos(ler);
				break;
			case 3:
				System.out.println("Entre com a quantidade de dias que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.diasParaHoras(ler);
				break;
			case 4:
				System.out.println("Entre com a quantidade de semanas que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.semanasParaDias(ler);
				break;
			case 5:
				System.out.println("Entre com a quantidade de meses que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.mesesParaDias(ler);
				break;
			case 6:
				System.out.println("Entre com a quantidade de anos que deseja converter");
				ler = scan.nextInt();
				ConversaoDeUnidadesDeTempo.semanasParaDias(ler);
				break;
			}

		} while (ler != 7);

	}

	static void imprimirValor(double numero) {
		System.out.println(numero);
	}

	public static int menu() {
		System.out.println();
		System.out.println("========== CONVERSÃO DE UNIDADES DE TEMPO ==========");

		System.out.println("Olá! Aqui você pode converter unidades de tempo!");
		System.out.println("[1] Converter minutos em segundos");
		System.out.println("[2] Converter horas em minutos");
		System.out.println("[3] Converter dia em horas");
		System.out.println("[4] Converter semana em dias");
		System.out.println("[5] Converter meses em dias");
		System.out.println("[6] Converter anos em dias");
		System.out.println("[7] Sair");

		return scan.nextInt();
	}
}
