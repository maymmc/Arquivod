
public class Programa {
	public static void main(String[] args) {

		//        Pessoa(String nome, int idade, char sexo)
		//        Aluno(String nome, int idade, char sexo, boolean matriculado, String
		// curso)
		//        Professor(String nome, int idade, char sexo, String especialidade,
		// double salario)
		//        Funcionario(String nome, int idade, char sexo, String setor, boolean
		// trabalhando)

		Pessoa gabriel = new Visitante ("Gabriel", 24, 'm');
		System.out.println(gabriel.toString());
		Aluno mayra = new Aluno("Mayra", 21, 'f', true, "Programação orientada a objeto");
		Professor eliel = new Professor("Eliel", 38, 'm', "mestre jedi java", 1500);
		Funcionario andy = new Funcionario("Andy", 27, 'm', "Desenvolvimento", true);
		System.out.println(gabriel.getNome());

		mayra.statusAluno();
		mayra.fazerAniversario();
		mayra.statusAluno();

		System.out.println("Salário anterior: " + eliel.getSalario());
		eliel.receberAumento(eliel.getSalario() * 0.2);
		System.out.println("Salário atual: " + eliel.getSalario());
		System.out.println(" ");
		System.out.println("O funcionario está trabalhando?" + andy.isTrabalhando());
		andy.mudarTrabalho();
		System.out.println("O funcionario está trabalhando?" + andy.isTrabalhando());

	}
}
