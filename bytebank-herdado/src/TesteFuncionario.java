
public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario mayra = new Funcionario();
	mayra.setNome("mayra");
	mayra.setCpf("748894949-5");
	mayra.setSalario(1500);
	
	System.out.println(mayra.getNome());
	System.out.println(mayra.getBonificaçao());
	
}
}
