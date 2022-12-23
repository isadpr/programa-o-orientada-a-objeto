package aulaNatal;

public class Conta implements Comparable<Conta> {
	private double saldo;
	private String nome;
	
	public Conta(double s, String n) {
		saldo = s;
		nome = n;
	}
	
	public int compareTo(Conta c) {
		return Double.compare(saldo, c.saldo);
	}
	
	public String toString() {
		return nome + "-" + saldo;
	}
	
}
