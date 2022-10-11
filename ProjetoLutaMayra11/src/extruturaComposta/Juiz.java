package extruturaComposta;

import java.util.ArrayList;

public class Juiz extends Pessoa {
	private double comissao; // estrutura da conta, setar e dar um valor pra comissao
	private int anosDeExperiencia;
	private ArrayList<Luta> lutasRealizadas = new ArrayList<Luta>();

	// atributo junto com array
	// <Luta> é a classe Luta
	// CRIANDO UM METODO CONSTRUTOR PRA PASSAR OS PARAMETROS PARA CLASSE O PROGRAMA

	public Juiz(String nome, String nacionalidade, int idade, double comissao, int anosDeExperiencia) {
		super(nome, nacionalidade, idade);
		this.comissao = comissao;
		this.anosDeExperiencia = anosDeExperiencia;
		
	}
	
		
			public double obterTotalComissaoLutasRealizadas() {
		        double valorTotal = 0.0;
		        for (int i = 0; i < lutasRealizadas.size(); i++) {
		            Luta luta = lutasRealizadas.get(i);
		            valorTotal += luta.calcularComissaoJuiz();
		        }
		        return valorTotal;
		    }

		    public int obterQtdLutasRealizadas() {
		        return lutasRealizadas.size();
		    }

		    public double obterMediaComissaoLutasRealizadas() {
		        return obterTotalComissaoLutasRealizadas() / obterQtdLutasRealizadas();
		}
	
	

	public void setComissao(double comissao) {
		comissao += comissao;
	}

	public double getComissao() {
		return comissao;
	}

//	public void setComissao(double comissao) { ja está la em cima
//		this.comissao = comissao;
//	}

	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}

	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}

	public ArrayList<Luta> getLutasRealizadas() {
		return lutasRealizadas;
	}

	public void setLutasRealizadas(ArrayList<Luta> lutasRealizadas) {
		this.lutasRealizadas = lutasRealizadas;
	}

}
