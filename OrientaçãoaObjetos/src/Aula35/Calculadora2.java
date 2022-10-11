package Aula35;

public class Calculadora2 {

	public static int fibonacci(int num) {
		if (num < 2) {
			return 1;
			// posiçao 1
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	// 5=5+4+3+2+1 somatorio(4) -4+3+2+1
	// 4=4+3+2+1   somatorio(3) -+3+2+1
	// 3=3+2+1     somatorio(2) -+2+1
	// 2=2+1       somatorio(1) - +1
	// 1 =1        -1
	public static int somatorio(int num) {
		
		if(num==1) {
			return 1;
		}
		
		
		
		return num + somatorio(num - 1);
		
		
		
		
	}
}
