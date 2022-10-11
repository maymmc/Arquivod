
public class Cubo extends Figura3D {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 6 * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
		// Math.pow(lado,3);
	}

}
