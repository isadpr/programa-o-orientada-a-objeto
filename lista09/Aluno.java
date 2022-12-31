package lista09;

public class Aluno implements Comparable<Aluno>{
	private String id;
	private String nome;
	private double nota;
	
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Aluno (String id) {
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Aluno) {
			Aluno x = (Aluno) o;
			if(this.id.equals(x.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.id + this.nome + this.nota;
	}

	@Override
	public int compareTo(Aluno a) {
		return this.nome.compareTo(a.nome);
	} 
}
