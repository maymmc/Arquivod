
public class MultiplosCatch {
	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
			} catch (ArithmeticException e1) {
				System.out.println("erro ao dividir por zero");
				//System.exit(0); --ao terminar a execuçao do programa dentro do try o catch o FINALLY NAO É EXECUTADO

				// poderia ser usado dessa forma se os erros forem parecidos
				// catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				// System.out.println("erro ao dividir por zero");

			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("posiçao do array invalida");
				System.exit(0);
				//System.exit(0); --ao terminar a execuçao do programa dentro do try o catch o FINALLY NAO É EXECUTADO

			}
			// catch (Throwable e) { o throwable é a classe mais generica de erros-
			// superclass das classes de erro
			/// System.out.println("ocorreu um erro");

			finally {
				System.out.println("essa linha é impressa sempre apos o try ou catch");
			}
		}
	}
}
