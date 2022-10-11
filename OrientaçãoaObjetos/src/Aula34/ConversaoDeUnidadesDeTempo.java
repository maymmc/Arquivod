package Aula34;

public class ConversaoDeUnidadesDeTempo {

	public static int minutosParaSegundos(int minutos) {
		System.out.println(minutos * 60);
		return minutos * 60;
	}

	public static int horasParaMinutos(int horas) {
		System.out.println(horas * 60);
		return horas * 60;
	}

	public static int diasParaHoras(int dias) {
		System.out.println(dias * 24);
		return dias * 24;
	}

	public static int semanasParaDias(int semanas) {
		System.out.println(semanas * 7);
		return semanas * 7;
	}

	public static int mesesParaDias(int meses) {
		System.out.println(meses * 30);
		return meses * 30;
	}

	public static double anoParaDias(double ano) {
		System.out.println(ano * 365.25);
		return ano * 365.25;
	}

//	public static double minutos(double num1) {
//		double num1total =0;
//		num1total = num1 * 60;
//		System.out.println(num1 + " minutos tem " + num1total + " segundos ");
//		return num1;
//
//	}
//
//	public static double hora(double num1) {
//		double num1total =0;
//		num1total = num1* 60;
//		System.out.println(num1 + "dias tem " + num1total + "minutos");
//		return num1;
//	}
//
//	public static double dia(double num1) {
//		double num1total=0;
//		num1total = num1* 24;
//		System.out.println(num1 + "dias tem " + num1total + "dias");
//		
//		return num1;
//	}
//
//	public static double semana(double num1) {
//		double num1total=0;
//		 num1total= num1 * 7;
//		 System.out.println(num1 + "");
//		
//		return num1;
//	}
//
//	public static int mes(double num) {
//		return num;
//	}
//
//	public static double ano(double num) {
//		return num;
//	}
}