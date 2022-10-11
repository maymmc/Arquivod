
public class Programa {

	public static void main(String[] args) {

		
		Circulo redondo = new Circulo(10);
		System.out.println(" a area do circulo de raio " + redondo.getRaio() + " é: " + redondo.area());
		System.out.println(" o comprimento do circulo de raio " + redondo.getRaio() + " é: " + redondo.comprimento());

		Quadrado quadrado1 = new Quadrado (15);
		System.out.println(" a area do quadrado de lado " + quadrado1.getLado() + " é: " + quadrado1.area());
		System.out.println(" o comprimento do quadrado de lado " + quadrado1.getLado() + " é: " + quadrado1.comprimento());

	}
}
