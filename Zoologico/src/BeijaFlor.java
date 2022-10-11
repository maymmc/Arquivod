
public class BeijaFlor extends Ave {

	public BeijaFlor(double peso, int idade, int membros, String especie, String registro, String corPena) {
		super(peso, idade, membros, especie, registro, corPena);
		// TODO Auto-generated constructor stub
	}

	public void baterAsasVeloz() {
		System.out.println(" Ele bate as asas muito rapido");
	}

	@Override
	public void fazerNinho() {
		// TODO Auto-generated method stub
		System.out.println("faz ninho nos altos das arvores");
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println(" se locomove voando");

	}

	@Override
	public void alimentar() {
		System.out.println(" se alimmenta de frutas");
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSom() {
		System.out.println(" o som é piu piu piu");
		// TODO Auto-generated method stub

	}
}
