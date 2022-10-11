
public class Quadrado implements FormaGeometrica {

	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double area() {
		return (lado * lado);
	}

	@Override
	public double comprimento() {
		return (lado * 4);
		// soma dos lados
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
