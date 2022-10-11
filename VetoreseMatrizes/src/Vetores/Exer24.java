package Vetores;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("entre com um numero para  a posição" + i);
			vetorA[i] = scan.nextInt();
		}
		boolean palindromo = true;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				break;

			}
		}
		System.out.println("vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
			System.out.println();
			if (palindromo) {
				System.out.println("é um palindromo");
			} else {
				System.out.println("nao é um palindromo");
			}

		}
	}


