package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exer42 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int recebeValor = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("entre com o  valor A na posição - " + i);
			vetorA[i] = scan.nextInt();

		}
//		for (int i = 0; i < vetorA.length; i++) {
//			for (int j = 0; j < vetorA.length; j++) {
//				if (vetorA[i] < vetorA[j]) {
//					recebeValor = vetorA[i];
//					vetorA[i] = vetorA[j];
//					vetorA[j] = recebeValor;
//				}
//			}

		
		for (int i = 0; i < vetorA.length; i++) {
			Arrays.sort(vetorA);
			System.out.print(vetorA[i] + " ");
		}

	}
}
