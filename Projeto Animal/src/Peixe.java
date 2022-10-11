
public class Peixe extends Animal {
	
private String corEscama;

public Peixe (double peso, int idade, int membros, String corEscama) {
	super(peso, idade, membros);
	this.corEscama = corEscama;


	
	
}

@Override
public void locomover() {
	// TODO Auto-generated method stub
	System.out.println("nadando");
}

@Override
public void alimentar() {
	// TODO Auto-generated method stub
	System.out.println("comendo Substancias");
}

@Override
public void emitirSom() {
	// TODO Auto-generated method stub
	System.out.println("soltou uma bolha");
}





public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}
}




