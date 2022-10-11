
public class ImpostodeRendaJoao {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario > 1900 && salario < 2800.0) {
			System.out.println("Sua aliquota é de 7,5%");
			System.out.println(" vc pode deduzir ate 142");
		} else 
			if (salario > 2800 && salario < 3751) {
			System.out.println("sua aliquota é de 15%");
			System.out.println("vc pode dedudiz ate 350");
		} else if (salario < 4664.0) {
			System.out.println("sua aliquota é de 22,5%");
			System.out.println("vc pode dedudiz ate 636");
			
		}
	}
}
//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636