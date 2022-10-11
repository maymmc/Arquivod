
public class Circulo implements FormaGeometrica {

	private double raio;
	private static final double PI = 3.14;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		return (PI * raio * raio);
	}

	@Override
	public double comprimento() {
		return (2 * PI * raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return PI;
	}

}
