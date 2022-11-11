package p1_2016;

public class Chocolate extends Produto implements Comestivel {
	private String tipo;
	
	public Chocolate(double preco, int id) {
		super(preco, id);
	}

	public void desembalar() {
		System.out.println("O chocolate está sendo desembalado");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
