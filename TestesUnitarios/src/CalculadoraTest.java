import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos () {
		Calculadora cal = new Calculadora ();
		int soma = cal.somar(3, 7);
	
		//metodo para verificar se 2 valores sao iguais
	
		//recebe dois parametros, o primeiro paramentro é o valor q eu to esperando e o segundo é o valor
		//q vo ta comparando 
		assertEquals(10, soma);
	
	}
}
