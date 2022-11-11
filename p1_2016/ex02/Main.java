package p1_2016;

public class Main {
	public static void main (String[] args) {
		Loja lojaDaIsa = new Loja();
		
		Carro nissan = new Carro(200000, 547);
		nissan.setPlaca("ABC-1234");
		
		Liquidificador liquidificador = new Liquidificador(150, 27);
		liquidificador.setMarca("Britania");
		
		Chocolate lindt = new Chocolate(60, 7);
		lindt.setTipo("amargo");
		
		lojaDaIsa.adicionarAoEstoque(nissan);
		lojaDaIsa.adicionarAoEstoque(liquidificador);
		lojaDaIsa.adicionarAoEstoque(lindt);
		
		Cliente thiago = new Cliente();
		thiago.setCpf("XXXXXXXXX");
		thiago.comprar(lojaDaIsa, nissan);
		thiago.comprar(lojaDaIsa, lindt);
		
		System.out.println(lojaDaIsa.faturamentoBruto());
		System.out.println(lojaDaIsa.quantidadeProdutosVendidos());
		System.out.println(lojaDaIsa.quantidadeProdutosLigaveisVendidos());
		lojaDaIsa.imprimirRelatorioVenda();
		lojaDaIsa.imprimirProdutosNoEstoque();
		
	}

}
