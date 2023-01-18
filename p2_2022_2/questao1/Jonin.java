package p2_2022_2;

public class Jonin extends Ninja {
	
	public void treinar() {
		System.out.println("Jonin " + getNome() + " iniciando treinamento de meditação");
	}

	public Jonin(String cpf, String nome, int idade) {
		super(cpf, nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Jonin(String cpf) {
		super(cpf);
	}
}
