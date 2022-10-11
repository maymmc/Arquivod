package Matrizes;


import java.util.Random;

public class Exer2 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];

		Random numRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numRandom.nextInt(98);
			}
		}

		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Maior valor = " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
	}
}
