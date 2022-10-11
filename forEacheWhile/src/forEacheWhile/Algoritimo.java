package forEacheWhile;

import java.util.Scanner;

public class Algoritimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 1;
		int total = 0;

		while (i <= 5) {
			System.out.println("digite a idade da " + i + "ª pessoa: ");
			int idade = scan.nextInt();
			total = total + idade;
			i++;

		}
		System.out.println("o total é: " + total);

		for (int j = 1; j <= 5; j++) {
			System.out.println("digite a idade da " + j + "ª pessoa: ");
			int idade = scan.nextInt();
			total = total + idade;

		}
		System.out.println("o total é: " + total);
		
	}

}