import java.util.ArrayList;

public class Pedido {

	private String nomeCliente;
	private boolean taxaDeServico;

	private ArrayList<Item> itensConsumidos1;

	public Pedido() {
		itensConsumidos1 = new ArrayList<Item>();

	}

	public double exibir() {
		double resultados = 0;
		for (int i = 0; i < itensConsumidos1.size(); i++) {
			Item item = itensConsumidos1.get(i);
			resultados = resultados + (item.getPreco() * 0.15);

		}
		return resultados;
	}

	public double calcularTotal() {
		double resultados = 0;
		for (int i = 0; i < itensConsumidos1.size(); i++) {
			Item item = itensConsumidos1.get(i);
			if (taxaDeServico) {
				resultados = resultados + item.getPreco() + (item.getPreco() * 0.15);
			} else {
				resultados = resultados + item.getPreco();
			}
		}
		return resultados;

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public boolean isTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public ArrayList<Item> getItensConsumidos1() {
		return itensConsumidos1;
	}

	public void setItensConsumidos1(ArrayList<Item> itensConsumidos1) {
		this.itensConsumidos1 = itensConsumidos1;
	}

}
