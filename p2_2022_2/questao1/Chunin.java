package p2_2022_2;

public class Chunin extends Ninja {
	
	public void treinar() {
		System.out.println("Chunin " + getNome() + " iniciando treinamento avançado");
	}

	public Chunin(String cpf, String nome, int idade) {
		super(cpf, nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Chunin(String cpf) {
		super(cpf);
	}
	
}
