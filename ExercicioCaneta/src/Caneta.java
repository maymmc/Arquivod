
public class Caneta {
	private String modelo;
	private String cor;
	 private float ponta;
	 private boolean tampa;

	 //metodo construtor
	 public Caneta(String modeloCaneta) {
		 modelo = modeloCaneta;
		 tampar();
	 }
	 public Caneta(String modeloCaneta, String corCaneta) {
		 this(modeloCaneta); // 2 contrutores
		 cor = corCaneta;
		                         // modelo = modeloCaneta;
		                               //tampar();
		                            //cor = corCaneta;
	 }
	 
	 
	 
	 
	//set e get
	 public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}
	

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampa() {
		return tampa;
	}

	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	
	
	}
	
//medotos

	public void tampar() {
		tampa = true;
		System.out.println("A caneta do " + modelo + "esta tampada");
	}
	public void destampar() {
		tampa = false;
		System.out.println("A caneta" + modelo + " está destampada ");
	}
	public void  rabiscar () {
		if(tampa = false)//condição se a caneta ta destampada
			System.out.println("rabiscando com a caneta " + modelo + " da cor " + cor );
		else
			System.out.println("a caneta " + modelo + "esta tampada");
		
			
	}
		
	public void status() {
		System.out.println(" cor: " + cor);
		System.out.println(" modelo: " + modelo);
		System.out.println(" ponta " + ponta);
		System.out.println(" tampa: " + tampa);
	}
}