package Vetores;

import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);

				int[] vetorA = new int[11];
				int[] vetorB = new int[vetorA.length];

				for (int i = 0; i < vetorA.length; i++) {
					System.out.println("Entre com o valor da posição A " + i);
					vetorA[i] = scan.nextInt();
					vetorB[i] = 0;
				}
		for (int i = 0; i < vetorA.length; i++) {
					for (int j = 0; j < vetorA.length; j++) {
						vetorB[i] = vetorB[i] + vetorA[j];
					}
				}
				for (int i = 0; i < vetorA.length; i++) {
					System.out.println("B[" + i + "] = " + vetorB[i]);
				}
			}
}
