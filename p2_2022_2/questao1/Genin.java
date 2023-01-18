package p2_2022_2;

public class Genin extends Ninja {
	
	public void treinar() {
		System.out.println("Genin " + getNome() + " iniciando treinamento simples");
	}

	public Genin(String cpf, String nome, int idade) {
		super(cpf, nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Genin(String cpf) {
		super(cpf);
	}
	
}
