
public class Teste {
	public static void main(String[] args) {

		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		
		Circulo c1 = new Circulo();
		c1.setRaio(2);
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(2);
		t1.setBase(3);
		
		Cubo cubo = new Cubo();
		cubo.setLado(3);
		
		Cilindro cili = new Cilindro();
		cili.setAltura(3);
		cili.setRaio(3);
		
		Piramide p1 = new Piramide();
		p1.setAltura(3);
		p1.setApotema(4);
		p1.setArestaBase(2);
		p1.setNumPoliBase(4);
		p1.setBase(t1);

		FiguraGeometrica [] figuras = new FiguraGeometrica [6];
		figuras[0] = q1;
		figuras[1] = c1;
		figuras[2] = t1;
		figuras[3] = cubo;
		figuras[4] = cili;
		figuras[5] = p1;
		
		for(int i=0; i<figuras.length; i++) {
			System.out.println("--------");
			System.out.println(figuras);
		}
		
		
		
		
	}

}
