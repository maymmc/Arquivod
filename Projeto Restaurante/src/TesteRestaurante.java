
public class TesteRestaurante {
	public static void main(String[] args) {

		Lanche xEspecial = new Lanche();
		xEspecial.setNome("Especial da Casa");
		xEspecial.setPreco(32.50);
		xEspecial.setPeso(1.3);
		xEspecial.setIngredientes(
				"Pão Sírio, rostbief, molho de gengibre com rúcula, tomates, geleia de pimenta, cebola caramlizada e onion rings");

		Lanche batataFrita = new Lanche();
		batataFrita.setNome("Fryes");
		batataFrita.setPreco(15.00);

		Bebida cocaCola = new Bebida();
		cocaCola.setNome("Coca-Cola");
		cocaCola.setPreco(7.50);
		cocaCola.setVolume(1);

		Pedido pedido1 = new Pedido();
		pedido1.getItensConsumidos1().add(xEspecial);
		pedido1.getItensConsumidos1().add(cocaCola);
		pedido1.getItensConsumidos1().add(batataFrita);

		pedido1.setNomeCliente("Eliel");

		pedido1.setTaxaDeServico(true);

		System.out.println(" Olá " + pedido1.getNomeCliente() + " valor total é  de: R$ " + pedido1.calcularTotal()
				+ " " + " Valor da taxa " + pedido1.exibir());

	}

}

//		- Adicionar um lanche com valor R$ 32,50
//		  - Adicionar uma bebida com valor R$ 7,50
//		  - Adicionar um pedido com taxa de serviço e inserir os itens dentro do pedido
//		  - Chamar o método calcularTotal e apresentar na tela o valor final
//		Formato de exibição no caso de Tx ativa: "Pedido cliente Eliel - Valor total R$ 50,00 (Valor da taxa de Serviço de R$ 7,50)"
//		Formato de exibição no caso de Tx inativa: "Pedido cliente Eliel - Valor total R$ 50,00 (Sem Taxa de serviço cobrada)"
