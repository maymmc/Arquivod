package Aula02;

public class Caneta {
//atributos das canetas- caracteristicas
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampa;
	
	
	// deficição de metodos açao (o que ela pode fazer) -comportamentos
	public void escrever () {
		}
	public void rabiscar () {
		if (tampa == true) {
			System.out.println("Erro não posso rabiscar");
			} else {
				System.out.println(" Posso rabiscar");
			}
}
	public void pintar () {
}
	public void tampar () {
		tampa = true;
	}
	public void destampar () {
        tampa = false;	
}
}