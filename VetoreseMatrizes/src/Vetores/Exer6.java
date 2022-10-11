package Vetores;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorB.length]; //o vetor b e c tao recebendo o mesmo tamanho de a (.length)
	
		for (int i = 0; i<vetorA.length; i++) {
		System.out.println("entre o valor do vetorA da posiçao é: " + i);
		vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i<vetorB.length; i++) {
			System.out.println("entre o valor do vetorB da posiçao é: " + i);
			vetorB[i] = scan.nextInt();
			}
		for (int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			}
		System.out.println("valor A");
		for (int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " " );
		}
		System.out.println();
		System.out.println("valor B");
		for (int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " " );
		}
		System.out.println();
		
		System.out.println("valor C");
		for (int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " " );
		}
		System.out.println();
	
	
	
	}
	
}
