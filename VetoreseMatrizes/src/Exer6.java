import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("========== Jogo da Velha ==========");
		System.out.println("Jogador 1 → X");
		System.out.println("Jogador 2 → O");
		System.out.println();

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;

		while (!ganhou) {
			if (jogada % 2 == 1) { // jogador1 - numeros impares
				System.out.println();
				System.out.println("Vez do Jogador 1, escolha linha e coluna (1-3)");
				sinal = 'X';

			} else {
				System.out.println();
				System.out.println("Vez do Jogador2, escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			System.out.println("");
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.print("Escolha um número para a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				System.out.println();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println();
					System.out.println("JOGADA INVÁLIDA!. Tente novamente!");
				}
			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println();
				System.out.print("Escolha um número para a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				System.out.println();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println();
					System.out.println("JOGADA INVÁLIDA! Tente novamente!");
				}
			}

			// coluna= coluna-1 | linha -=1 => decremento
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println();
				System.out.println("Posição já dada! Tente novamente");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimindo o tabuleiro

			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// verificando se existe um ganhador com if

			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha0
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha1
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha2
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna0
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna1
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna2
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || // diagonal1
					(jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // diagonal2
				ganhou = true;
				System.out.println("******** PARABÉNNNNNNNNS, o jogador 1 ganhou! ********");
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha0
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha1
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha2
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna0
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna1
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna2
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || // diagonal
					(jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) {
				ganhou = true;
				System.out.println();
				System.out.println("******** PARABÉNNNNNNNNS, o jogador 2 ganhou! ********");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println();
				System.out.println("Ninguém ganhou! =( ");
			}

		}
	}
}
