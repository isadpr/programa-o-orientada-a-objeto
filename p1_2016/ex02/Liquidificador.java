package p1_2016;

public class Liquidificador extends Produto implements Ligavel {
	private String marca;
	
	public Liquidificador(double preco, int id) {
		super(preco, id);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void ligar() {
		System.out.println("O liquidificador esta ligando");
	}

}
