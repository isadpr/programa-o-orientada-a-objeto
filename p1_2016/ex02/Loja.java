package p1_2016;
import java.util.ArrayList;

public class Loja {
	private int id;
	private String nome;
	private ArrayList<Produto> produtosVendidos = new ArrayList<Produto>();
	private ArrayList<Produto> estoque = new ArrayList<Produto>();
	
	public double faturamentoBruto() {
		System.out.println("faturamento bruto");
		
		double faturamento = 0;
		for(int i=0; i<produtosVendidos.size(); i++) {
			faturamento = produtosVendidos.get(i).getPreco() + faturamento;
		}
		return faturamento;
	}
	
	public int quantidadeProdutosVendidos() {
		System.out.println("quantidade de produtos vendidos");
		
		int qntVendidos = 0;
		
		for(int i=0; i<produtosVendidos.size(); i++) {
			qntVendidos++;
		}
		return qntVendidos;
	}

	public int quantidadeProdutosLigaveisVendidos() {
		System.out.println("quantidade de produtos ligaveis vendidos");
		
		int qntVendidosLigaveis = 0;
		
		for(int i=0; i<produtosVendidos.size(); i++) {
			if(produtosVendidos.get(i) instanceof Ligavel) {
				qntVendidosLigaveis++;
			}
		}
		return qntVendidosLigaveis;
	}
	
	public void imprimirRelatorioVenda() {
		System.out.println("relatorio de venda");
		
		for(int i=0; i<produtosVendidos.size(); i++) {
			System.out.println("id: " + produtosVendidos.get(i).getId() + " preço: " + produtosVendidos.get(i).getPreco());
			
			if(produtosVendidos.get(i) instanceof Carro) {
				Carro carro = new Carro(produtosVendidos.get(i).getPreco(), produtosVendidos.get(i).getId());
				System.out.println("placa do carro: " + carro.getPlaca());
			}
			if(produtosVendidos.get(i) instanceof Liquidificador) {
				Liquidificador liquidificador = new Liquidificador(produtosVendidos.get(i).getPreco(), produtosVendidos.get(i).getId());
				System.out.println("marca do liquidificador: " + liquidificador.getMarca());
			}
			if(produtosVendidos.get(i) instanceof Chocolate) {
				Chocolate chocolate = new Chocolate(produtosVendidos.get(i).getPreco(), produtosVendidos.get(i).getId());
				System.out.println("tipo do chocolate: " + chocolate.getTipo());
			}
		}
	}
	
	public void adicionarAoEstoque(Produto produto) {
		estoque.add(produto);
	}
	
	public void imprimirProdutosNoEstoque() {
		System.out.println("estoque");
		
		for(int i=0; i<estoque.size(); i++) {
		System.out.println("id: " + estoque.get(i).getId() + " preco: " + estoque.get(i).getPreco());
		
			if(estoque.get(i) instanceof Carro) {
				Carro carro = new Carro(estoque.get(i).getPreco(), estoque.get(i).getId());
				System.out.println("placa do carro: " + carro.getPlaca());
			}
			if(estoque.get(i) instanceof Liquidificador) {
				Liquidificador liquidificador = new Liquidificador(estoque.get(i).getPreco(), estoque.get(i).getId());
				System.out.println("marca do liquidificador: " + liquidificador.getMarca());
			}
			if(estoque.get(i) instanceof Chocolate) {
				Chocolate chocolate = new Chocolate(estoque.get(i).getPreco(), estoque.get(i).getId());
				System.out.println("tipo do chocolate: " + chocolate.getTipo());
			}
		}
	}
	
	public void vender (Produto produto) {
		estoque.remove(produto);
		produtosVendidos.add(produto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
