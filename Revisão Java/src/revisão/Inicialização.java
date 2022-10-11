package revisão;
//array coleçao de numeros aleatorios. indice é o jeito q o java entende a posição- inicia no 0
// posição é o jeito q o nosso cerebro pensa- inicia no 1

public class Inicialização {
	
	private static String nomeJogador;

	public static void main(String[] args) { //metodo static tem que ter a variavel static para avançar
		
	
		String primeiraVariavelMain = "Primeira Variavel";
        if (nomeJogador == null) {
            primeiraVariavelMain = "Primeira Variavel Main Após Checagem nomeJogador";
            nomeJogador = "Bruno Yan";
            
            // Coleção numeroAleatórios visível apenas dentro do escopo de if (nomeJogador == null) {}
            // {1,3,9,5,22} estão nos índices [0],[1],[2],[3],[4]
            int[] numerosAleatorios = {1,3,9,5,22};
            for (int indiceNumerosAleatorios = 0; indiceNumerosAleatorios < numerosAleatorios.length; indiceNumerosAleatorios++) {
                System.out.println(numerosAleatorios[indiceNumerosAleatorios]);
            }
        }
        
        //numeroAleatorios
        System.out.println("Inicializacao()");
    }
    
    public void exibirNomeJogador() {
        System.out.println(nomeJogador);
    }
}
