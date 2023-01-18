package p2_2022_2;

public class Ninja implements Treinamento, Comparable<Ninja>  {
	@Override
	public void treinar() {
		// TODO Auto-generated method stub
	}
	
	private String cpf;
	private String nome;
	private int idade;
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public Ninja(String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Ninja(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Ninja) {
			Ninja n = (Ninja) o;
			return this.cpf.equals(n.getCpf());
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.nome + this.cpf + this.idade;
	}
	
	@Override
	public int compareTo(Ninja o) {
		return Double.compare(this.idade, o.getIdade());
	}
	
}
