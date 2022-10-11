
public class Cilindro extends Figura3D {

	private int altura;
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// declarar duas variaveis pra poder calcular o total
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;

		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return Math.PI * (raio * raio) * altura;
	}

}
