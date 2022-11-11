package p1_2016;

public class Carro extends Brinquedo implements Ligavel {
	private String placa;
	
	public Carro (double preco, int id) {
		super(preco, id);
	}
	
	public void ligar() {
		System.out.println("O carro está ligando");
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
