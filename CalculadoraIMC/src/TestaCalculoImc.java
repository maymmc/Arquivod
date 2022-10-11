import java.util.Scanner;

public class TestaCalculoImc {
	public static void main(String[] args) {
		System.out.println("Vamos calcular seu IMC!");
		System.out.println("Digite seu nome: ");
		
		Scanner scanner = new Scanner (System.in);
		
		String nome;
		double altura;
		double massa;
		
	     // Perguntar dados ao usuário
        System.out.println("Vamos calcular seu IMC!");
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu peso em KG: ");
        massa = scanner.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        altura = scanner.nextDouble();
        
        // Instanciar objeto do tipo Pessoa e calcular IMC
        Pessoa pessoa = new Pessoa(nome, massa, altura);
        pessoa.calculaImc();
        
        // Mostrar dados a pessoa
        System.out.println("Olá " + pessoa.getNome());
        System.out.println("O seu IMC é " + pessoa.getImc());
        System.out.println("Sua categoria de peso é: " + pessoa.retornaCategoriaPeso());
    }

	}


