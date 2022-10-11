package Vetores;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("entre com a posiçao " + i);
			vetorA[i] = scan.nextInt();
		}
		int qtdadesPares = 0;
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				// qtdPares = qtdPares+1; ou qtdPares +=1; ou pode fazer igual na linha abaixo
				// qtdPares ++;
				qtdadesPares++;
			}
		}
		System.out.println("vetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("quantidades de numeros pares " + qtdadesPares);
	}

}
