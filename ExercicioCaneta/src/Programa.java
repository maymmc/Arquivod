import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		
		//criaçao de 3 canetas
		Caneta bicAzul = new Caneta("Bic");  //criaçao do objeto que é instancia da classe CANETA
		
		bicAzul.setCor("Azul");
		bicAzul.setPonta(0.5f);
		bicAzul.status();
		
		//System.out.println(bicAzul.getModelo());

		Caneta canetaTinteiro = new Caneta ("Tinteiro", "Preta");  //inicialização do objeto
			canetaTinteiro.setTampa(false);
		canetaTinteiro.setPonta(0.4f);
		canetaTinteiro.status();
		
		Caneta bicVermelha = new Caneta ("Bic");  //inicialização do objeto
		bicVermelha.setModelo("bic luminosa");
		bicVermelha.setCor("roxo");
		bicVermelha.setModelo("Bic");
		bicVermelha.setTampa(true);
		bicVermelha.setPonta(0.1f);
		
		Caneta canetaSelecionada; //guardar o dado digitado
		
		int opcaoMenu = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("selecione a caneta ");
			System.out.println("1- caneta  bic azul");
			System.out.println("2- caneta  tinteiro preta");
			System.out.println("3- caneta  bic vermelha");
			System.out.println("4- sair");
			
			opcaoMenu = sc.nextInt();
			
		} while (opcaoMenu != 4);  //!= diferente - laço
			
		}
		
		
		
		
	}


