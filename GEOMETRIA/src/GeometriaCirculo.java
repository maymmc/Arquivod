
public class GeometriaCirculo {
	private double raio;
	private static final double PI = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return (PI * raio * raio);
	}
	
	public double perimetro() {
		return (2 * PI * raio);
	}

}
